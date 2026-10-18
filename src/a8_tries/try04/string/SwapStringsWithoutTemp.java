package a8_tries.try04.string;

/**
 * <h2>Problem: Swap Two Strings Without Using a Temp Variable</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to swap the values of two String variables without using a third
 * or temporary variable. This is commonly achieved using string concatenation and substring methods.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The values of the two string variables swapped.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Before swap: {@code a = "Hello"}, {@code b = "World"}<br>
 *       After swap:  {@code a = "World"}, {@code b = "Hello"}</li>
 *   <li><b>Example 2:</b><br>
 *       Before swap: {@code a = "Java"}, {@code b = "Python"}<br>
 *       After swap:  {@code a = "Python"}, {@code b = "Java"}</li>
 * </ul>
 */
public class SwapStringsWithoutTemp {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        System.out.println("Before swap: a = \"" + a + "\", b = \"" + b + "\"");

        // Boilerplate demonstrating swap logic without temp variable
        swapStrings(a, b);
    }

    /**
     * Swaps two string variables without using a third temporary variable.
     * Note: In Java, strings are passed by value (reference value), so swapping
     * local references inside a method does not alter caller's variables unless
     * an array or wrapper is returned.
     *
     * @param a first string
     * @param b second string
     * @return a String array containing {swappedA, swappedB}
     */
    public static String[] swapStrings(String a, String b) {
        // TODO: Implement swap without temp variable using concatenation and substring
        // e.g. a = a + b; b = a.substring(0, a.length() - b.length()); a = a.substring(b.length());
        return new String[]{a, b};
    }
}
