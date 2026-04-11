package bigo.space;

/**
 * Linear Space Complexity - O(n)
 * This means the operation uses memory proportional to the input size.
 * Example: Storing elements in an array.
 */
public class LinearSpace {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Linear Space Complexity - O(n)
     * Storing elements in an array.
     */
    public static void storeElements(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        System.out.println("Array stored with " + n + " elements.");
    }
}
