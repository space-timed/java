package bigo.time;

/**
 * Constant Time Complexity - O(1)
 * This means the operation takes the same amount of time regardless of the input size.
 * Example: Accessing an element in an array by index.
 */
public class ConstantTime {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Constant Time Complexity - O(1)
     * Accessing an element in an array by index.
     */
    public static void accessArrayElement() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Element at index 2: " + array[2]); // Always takes the same time.
    }
}
