package a7_javapack.versions.java26;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;

/**
 * Demonstrations of finalized JDK 26 features (JEPs listed by the user):
 * - JEP 500: Prepare to Make Final Mean Final (behavior change around reflective mutation of final fields)
 * - JEP 516: Ahead-of-Time Object Caching with Any GC (AOT caching improvements)
 * - JEP 517: HTTP/3 for the HTTP Client API
 * - JEP 522: G1 GC: Improve Throughput by Reducing Synchronization
 * - JEP 504: Remove the Applet API (Removal)
 *
 * Each demonstrate*() method contains an extended example or runtime check where possible,
 * and explanatory comments. Run with JDK 26 to observe the intended behaviors.
 */
public class Java26NewFeatures {

	public static void main(String[] args) {
		System.out.println("--- Java 26 Feature Demos ---\n");

		demonstratePrepareToMakeFinalMeanFinal();
		System.out.println();

		demonstrateAOTObjectCaching();
		System.out.println();

		demonstrateHttp3Support();
		System.out.println();

		demonstrateG1GcInfo();
		System.out.println();

		demonstrateAppletRemoval();
		System.out.println();

		System.out.println("--- End of Demos ---");
	}

	// JEP 500: Prepare to Make Final Mean Final
	// This demonstrates an attempt to mutate a final field reflectively. Historically, code
	// could use reflection (and setAccessible(true)) to change final fields. JEP 500 prepares
	// the platform so that final truly means final; reflective mutation will be warned or
	// eventually prohibited. Behavior depends on runtime enforcement in the JDK.
	public static void demonstratePrepareToMakeFinalMeanFinal() {
		System.out.println("JEP 500: Prepare to Make Final Mean Final");

		class Holder {
			// final field we will try to mutate reflectively
			public final int value = 1;
			public String toString() { return "Holder[value=" + value + "]"; }
		}

		Holder h = new Holder();
		System.out.println("Before reflective change: " + h);

		try {
			Field f = Holder.class.getDeclaredField("value");
			// Historically setAccessible(true) was used to bypass checks. On modern runtimes
			// this may be disallowed or produce warnings; JEP 500 signals the platform intent.
			f.setAccessible(true);
			f.setInt(h, 99); // attempt to change the final field
			System.out.println("After reflective change attempt: " + h);
		} catch (Throwable ex) {
			System.out.println("Reflective change failed or was prevented: " + ex);
			System.out.println("This is expected on runtimes enforcing 'final' semantics (JEP 500).");
		}

		System.out.println("Note: If the runtime allows reflective mutation this may still succeed (legacy behavior).");
		System.out.println("On JDK 26+ you should expect warnings or failure when mutating final fields reflectively.");
	}

	// JEP 516: Ahead-of-Time Object Caching with Any GC
	// This JEP extends the AOT object caching facility so cached objects can be loaded with any GC.
	// Demonstration: create an immutable object suitable for caching and print guidance on creating
	// an AOT cache. The actual AOT caching step is performed at image creation time (tooling), so
	// here we provide a runnable example object and printed instructions to create the cache.
	public static void demonstrateAOTObjectCaching() {
		System.out.println("JEP 516: Ahead-of-Time Object Caching with Any GC");

		// Immutable record is an excellent candidate for AOT object caching because its
		// state is fixed at creation and safe to embed in a cached heap image.
		record ImmutablePoint(int x, int y) { }

		ImmutablePoint p = new ImmutablePoint(3, 4);
		System.out.println("Example immutable object that is safe for AOT caching: " + p);

		System.out.println("Notes:");
		System.out.println(" - JEP 516 makes cached objects portable across GCs. To actually produce an AOT cache,");
		System.out.println("   use the JDK's AOT tooling (for example `java -XX:AOTLibrary` or the dedicated AOT/cache");
		System.out.println("   commands provided by your JDK distribution). AOT steps are performed outside the application.");
		System.out.println(" - The demonstration above shows a pattern (immutable value) suitable for caching.");
	}

	// JEP 517: HTTP/3 for the HTTP Client API
	// Demonstration: construct an HttpClient requesting HTTP/3 and attempt a short request.
	public static void demonstrateHttp3Support() {
		System.out.println("JEP 517: HTTP/3 for the HTTP Client API");

		try {
			// Build an HttpClient that prefers HTTP/3. If the platform supports HTTP/3 this will be used
			// for connections to servers that negotiate HTTP/3. On platforms without HTTP/3 support the
			// client will fall back to other protocols.
			HttpClient client = HttpClient.newBuilder()
					.version(HttpClient.Version.HTTP_3)
					.connectTimeout(Duration.ofSeconds(5))
					.build();

			System.out.println("Created HttpClient with requested version: " + client.version());

			// A lightweight request to test connectivity. Use a short timeout and handle failures gracefully.
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://www.example.com/"))
					.timeout(Duration.ofSeconds(5))
					.GET()
					.build();

			System.out.println("Sending request (may fall back if server doesn't support HTTP/3 or network is unavailable)...");
			HttpResponse<Void> resp = client.send(request, HttpResponse.BodyHandlers.discarding());
			System.out.println("Response status code: " + resp.statusCode());
			System.out.println("Negotiated protocol: " + resp.version());
		} catch (NoSuchMethodError | NoClassDefFoundError nsme) {
			// Defensive: in case this is compiled/run on non-JDK26 environment
			System.out.println("HTTP/3 API not available on this runtime: " + nsme);
		} catch (Throwable t) {
			System.out.println("HTTP/3 test request failed or fell back to another protocol: " + t);
			System.out.println("If you are offline or the server doesn't negotiate HTTP/3 the client will fall back.");
		}
	}

	// JEP 522: G1 GC: Improve Throughput by Reducing Synchronization
	// Demonstration: query GC MXBeans to show which collectors are available and trigger some allocations
	// to encourage GC activity. The real JEP is an internal GC improvement; here we show how to detect
	// the GC in use and where to look for logs to observe throughput improvements.
	public static void demonstrateG1GcInfo() {
		System.out.println("JEP 522: G1 GC improvements (observability demo)");

		List<GarbageCollectorMXBean> gcs = ManagementFactory.getGarbageCollectorMXBeans();
		System.out.println("Available Garbage Collector MXBeans:");
		for (GarbageCollectorMXBean gc : gcs) {
			System.out.println(" - Name: " + gc.getName() + ", Pools: " + String.join(", ", gc.getMemoryPoolNames()));
		}

		// Indicate which GC is the default or in use by checking the 'java.vm.name' property.
		String vmName = System.getProperty("java.vm.name");
		System.out.println("VM: " + vmName + ", java version: " + System.getProperty("java.version"));

		System.out.println("To observe JEP 522 effects, run your application with G1 enabled (if not default) and use\n"
				+ " -Xlog:gc*:file=gc.log or the appropriate logging flags. The JEP reduces internal synchronization\n"
				+ " in G1 to improve throughput under contention; improvements are best observed under real workloads.");

		// Simple allocation storm to create some GC activity (brief, controlled)
		try {
			for (int round = 0; round < 3; round++) {
				byte[][] blobs = new byte[2000][];
				for (int i = 0; i < blobs.length; i++) blobs[i] = new byte[1024];
				// Hint to GC (may or may not trigger immediate collection)
				System.gc();
				Thread.sleep(200);
				System.out.println("Allocation round " + (round + 1) + " completed");
			}
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}

	// JEP 504: Remove the Applet API (Removal)
	// Demonstration: attempt to locate the classic Applet class reflectively. On JDK 26 the class has been
	// removed from the platform; Class.forName should throw ClassNotFoundException. This demonstrates an
	// important binary/compile-time compatibility change: code that referenced the Applet API must be updated.
	public static void demonstrateAppletRemoval() {
		System.out.println("JEP 504: Remove the Applet API");

		try {
			Class<?> appletClass = Class.forName("java.applet.Applet");
			System.out.println("Applet class found unexpectedly: " + appletClass);
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Applet API not found on this runtime (expected on JDK 26): " + cnfe.getMessage());
			System.out.println("If you have legacy applet code, migrate to alternatives (JavaFX, web-based UIs, or native apps).");
		}
	}
}


