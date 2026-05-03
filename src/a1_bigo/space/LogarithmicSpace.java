package a1_bigo.space;

/**
 * Logarithmic Space Complexity - O(log n)
 * This means the operation uses memory proportional to the logarithm of the input size.
 * Example: Recursive binary search.
 */
public class LogarithmicSpace {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Logarithmic Space Complexity - O(log n)
     * Recursive binary search.
     */
    public static boolean binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return false;
        }
        int mid = left + (right - left) / 2;
        if (array[mid] == target) {
            return true;
        } else if (array[mid] < target) {
            return binarySearch(array, target, mid + 1, right);
        } else {
            return binarySearch(array, target, left, mid - 1);
        }
    }
}
