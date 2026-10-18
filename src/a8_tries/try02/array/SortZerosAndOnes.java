package a8_tries.try02.array;

import java.util.Arrays;

/**
 * <h2>Problem: Sort Array of 0s and 1s (0s followed by 1s)</h2>
 *
 * <p><b>Description:</b><br>
 * Given a binary array containing only 0s and 1s, sort the array such that all 0s appear
 * first, followed by all 1s (e.g., using counting, two-pointer approach, or in-place swapping).</p>
 *
 * <p><b>Expected Output:</b><br>
 * The array sorted with all 0s on the left and all 1s on the right.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code [1, 0, 1, 1, 1, 1, 1, 0, 1, 0]}<br>
 *       Expected: {@code [0, 0, 0, 1, 1, 1, 1, 1, 1, 1]}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code [0, 1, 0, 1, 0]}<br>
 *       Expected: {@code [0, 0, 0, 1, 1]}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code [1, 1, 1]}<br>
 *       Expected: {@code [1, 1, 1]}</li>
 * </ul>
 */
public class SortZerosAndOnes {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 1, 1, 0, 1, 0};

        System.out.println("Original array: " + Arrays.toString(arr));
        sortZerosAndOnes(arr);
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }

    /**
     * Sorts a binary array so all zeros precede all ones.
     *
     * @param arr the binary array to sort in-place
     */
    public static void sortZerosAndOnes(int[] arr) {
        // TODO: Implement two-pointer or counting logic to sort 0s and 1s
    }
}
