package a6_designpatterns.creational;

import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/**
 * ============================================================================
 * DESIGN PATTERN: FACTORY METHOD (Creational)
 * ============================================================================
 * 
 * SIMPLE DEFINITION:
 * The Factory Method is a creational design pattern that defines an interface
 * or abstract method for creating an object, but allows subclasses to alter
 * the type of objects that will be created. Object creation is deferred to
 * a virtual method, decoupling high-level business workflows from concrete
 * product implementations and honoring the Open/Closed Principle (OCP) and
 * the Dependency Inversion Principle (DIP).
 * 
 * CORE PARTICIPANTS:
 * 1. Product (Interface): The uniform contract for objects created by the factory.
 * 2. Concrete Products: Vendor-specific or specialized product implementations.
 * 3. Creator (Abstract Base): Declares the factory method and provides template
 *    business methods that manipulate the product interface.
 * 4. Concrete Creators: Subclasses overriding the factory method to return
 *    specific product instances.
 */
public class Factory {

    // -------------------------------------------------------------------------
    // 1. PRODUCT ABSTRACTION & DATA CARRIERS
    // -------------------------------------------------------------------------
    public record UploadReceipt(String key, String eTag, String region, Instant timestamp) {}

    /**
     * Product Interface: Uniform contract for multi-cloud blob storage operations.
     */
    public interface CloudStorageClient {
        UploadReceipt upload(String objectKey, byte[] payload);
        byte[] download(String objectKey);
    }

    // -------------------------------------------------------------------------
    // 2. CONCRETE PRODUCTS
    // -------------------------------------------------------------------------
    public static class AwsS3Client implements CloudStorageClient {
        private final String bucket;

        public AwsS3Client(String bucket) {
            this.bucket = bucket;
        }

        @Override
        public UploadReceipt upload(String objectKey, byte[] payload) {
            System.out.printf("  [AWS S3] Uploaded %d bytes to s3://%s/%s%n",
                    payload.length, bucket, objectKey);
            return new UploadReceipt(objectKey, "s3-etag-" + objectKey.hashCode(), "us-east-1", Instant.now());
        }

        @Override
        public byte[] download(String objectKey) {
            return new byte[0];
        }
    }

    public static class GoogleCloudStorageClient implements CloudStorageClient {
        private final String project;

        public GoogleCloudStorageClient(String project) {
            this.project = project;
        }

        @Override
        public UploadReceipt upload(String objectKey, byte[] payload) {
            System.out.printf("  [GCS] Streaming %d bytes to gs://%s/%s via Workload Identity%n",
                    payload.length, project, objectKey);
            return new UploadReceipt(objectKey, "gcs-crc32-" + objectKey.hashCode(), "us-central1", Instant.now());
        }

        @Override
        public byte[] download(String objectKey) {
            return new byte[0];
        }
    }

    public static class AzureBlobClient implements CloudStorageClient {
        private final String container;

        public AzureBlobClient(String container) {
            this.container = container;
        }

        @Override
        public UploadReceipt upload(String objectKey, byte[] payload) {
            System.out.printf("  [Azure Blob] Stored block blob in container '%s' with SAS auth%n", container);
            return new UploadReceipt(objectKey, "azure-md5-" + objectKey.hashCode(), "eastus2", Instant.now());
        }

        @Override
        public byte[] download(String objectKey) {
            return new byte[0];
        }
    }

    // -------------------------------------------------------------------------
    // 3. ABSTRACT CREATOR (Template Method + Polymorphic Factory Method)
    // -------------------------------------------------------------------------
    public abstract static class CloudProviderEngine {

        /**
         * THE GOF FACTORY METHOD:
         * Abstract hook deferring object instantiation to subclasses.
         */
        protected abstract CloudStorageClient createStorageClient();

        /**
         * High-level business template method. Operates purely on the Product abstraction
         * without knowing whether AWS, GCP, or Azure is the backing provider.
         */
        public UploadReceipt backupDatabaseSnapshot(String snapshotName, byte[] payload) {
            System.out.println("[Orchestrator] Preparing encrypted payload: " + snapshotName);
            // Factory method dynamically called via virtual method dispatch
            CloudStorageClient client = createStorageClient();
            UploadReceipt receipt = client.upload(snapshotName, payload);
            System.out.println("[Audit] Persisted receipt: " + receipt);
            return receipt;
        }
    }

    // -------------------------------------------------------------------------
    // 4. CONCRETE CREATORS (Subclasses overriding the Factory Method)
    // -------------------------------------------------------------------------
    public static class AwsProviderEngine extends CloudProviderEngine {
        private final String bucketName;

        public AwsProviderEngine(String bucketName) {
            this.bucketName = bucketName;
        }

        @Override
        protected CloudStorageClient createStorageClient() {
            // Handles AWS STS role assumptions and connection pool tuning
            return new AwsS3Client(bucketName);
        }
    }

    public static class GcpProviderEngine extends CloudProviderEngine {
        private final String projectId;

        public GcpProviderEngine(String projectId) {
            this.projectId = projectId;
        }

        @Override
        protected CloudStorageClient createStorageClient() {
            // Handles GCP service account authorization and streaming buffers
            return new GoogleCloudStorageClient(projectId);
        }
    }

    public static class AzureProviderEngine extends CloudProviderEngine {
        private final String container;

        public AzureProviderEngine(String container) {
            this.container = container;
        }

        @Override
        protected CloudStorageClient createStorageClient() {
            return new AzureBlobClient(container);
        }
    }

    // -------------------------------------------------------------------------
    // 5. MODERN FUNCTIONAL REGISTRY FACTORY (Eliminating Subclass Explosion)
    // -------------------------------------------------------------------------
    public static class FunctionalCloudRegistry {
        public enum ProviderType { AWS, GCP, AZURE }

        private static final Map<ProviderType, Supplier<CloudStorageClient>> REGISTRY =
                new ConcurrentHashMap<>();

        static {
            REGISTRY.put(ProviderType.AWS, () -> new AwsS3Client("corp-default-s3"));
            REGISTRY.put(ProviderType.GCP, () -> new GoogleCloudStorageClient("corp-default-gcs"));
            REGISTRY.put(ProviderType.AZURE, () -> new AzureBlobClient("corp-default-blobs"));
        }

        public static void register(ProviderType type, Supplier<CloudStorageClient> factorySupplier) {
            REGISTRY.put(type, factorySupplier);
        }

        public static CloudStorageClient create(ProviderType type) {
            Supplier<CloudStorageClient> supplier = REGISTRY.get(type);
            if (supplier == null) {
                throw new IllegalArgumentException("No registered provider for: " + type);
            }
            return supplier.get();
        }
    }

    // -------------------------------------------------------------------------
    // DEMONSTRATION RUNNER
    // -------------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("=== PART 1: Classic GoF Factory Method (Polymorphic Creators) ===");
        byte[] dummyData = "SELECT * FROM financial_ledger;".getBytes();

        CloudProviderEngine awsEngine = new AwsProviderEngine("prod-financial-archive");
        awsEngine.backupDatabaseSnapshot("q3_balance_sheet.parquet", dummyData);

        System.out.println();
        CloudProviderEngine gcpEngine = new GcpProviderEngine("analytics-warehouse-prod");
        gcpEngine.backupDatabaseSnapshot("q3_analytics_raw.parquet", dummyData);

        System.out.println("\n=== PART 2: Modern Functional Registry Factory (Java Lambdas) ===");
        CloudStorageClient dynamicClient = FunctionalCloudRegistry.create(FunctionalCloudRegistry.ProviderType.AZURE);
        dynamicClient.upload("audit_log_2026.parquet", dummyData);
    }
}
