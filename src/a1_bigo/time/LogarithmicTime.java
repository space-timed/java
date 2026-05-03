package a1_bigo.time;

/**
 * Logarithmic Time Complexity - O(log n)
 * This means the operation reduces the problem size by a constant factor each time.
 * Example: Binary search in a sorted array.
 */
public class LogarithmicTime {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Logarithmic Time Complexity - O(log n)
     * Binary search in a sorted array.
     */
    public static void binarySearchExample() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int left = 0, right = sortedArray.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedArray[mid] == target) {
                System.out.println("Found target at index: " + mid);
                return;
            } else if (sortedArray[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Target not found.");
    }
}
