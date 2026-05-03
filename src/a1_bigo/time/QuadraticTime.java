package a1_bigo.time;

/**
 * Quadratic Time Complexity - O(n^2)
 * This means the operation takes time proportional to the square of the input size.
 * Example: Nested loops iterating over an array.
 */
public class QuadraticTime {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Quadratic Time Complexity - O(n^2)
     * Nested loops iterating over an array.
     */
    public static void nestedLoopsExample() {
        int[] array = {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Pair: (" + array[i] + ", " + array[j] + ")");
            }
        }
    }
}
