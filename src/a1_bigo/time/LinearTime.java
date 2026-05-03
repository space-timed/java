package a1_bigo.time;

/**
 * Linear Time Complexity - O(n)
 * This means the operation takes time proportional to the input size.
 * Example: Traversing an array to find an element.
 */
public class LinearTime {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Linear Time Complexity - O(n)
     * Traversing an array to find an element.
     */
    public static void traverseArray() {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Found target at index: " + i);
                return;
            }
        }
        System.out.println("Target not found.");
    }
}
