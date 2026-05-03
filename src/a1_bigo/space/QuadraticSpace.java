package a1_bigo.space;

/**
 * Quadratic Space Complexity - O(n^2)
 * This means the operation uses memory proportional to the square of the input size.
 * Example: Creating a 2D matrix.
 */
public class QuadraticSpace {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Quadratic Space Complexity - O(n^2)
     * Creating a 2D matrix.
     */
    public static void createMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i * j;
            }
        }
        System.out.println("Matrix of size " + n + "x" + n + " created.");
    }
}
