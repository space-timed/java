package a1_bigo.space;

/**
 * Linearithmic Space Complexity - O(n log n)
 * This means the operation uses memory proportional to a combination of linear and logarithmic steps.
 * Example: Merge sort algorithm.
 */
public class LinearithmicSpace {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Linearithmic Space Complexity - O(n log n)
     * Merge sort algorithm.
     */
    public static void mergeSortExample(int[] array) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        mergeSortExample(left);
        mergeSortExample(right);
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
