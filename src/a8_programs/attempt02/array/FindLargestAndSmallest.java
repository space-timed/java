package a8_programs.attempt02.array;

import java.util.Arrays;

/**
 * <h2>Problem: Find Largest and Smallest Number in an Unsorted Array</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to find both the largest (maximum) and smallest (minimum) numbers in an
 * unsorted array of integers without sorting the array, in a single traversal (O(n) time).</p>
 *
 * <p><b>Expected Output:</b><br>
 * An array or pair containing [smallest, largest] values.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code [32, 43, 53, 54, 32, 65, 63, 98, 43, 23]}<br>
 *       Expected: Smallest = {@code 23}, Largest = {@code 98}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code [-10, 0, 50, 100, -25]}<br>
 *       Expected: Smallest = {@code -25}, Largest = {@code 100}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code [7]}<br>
 *       Expected: Smallest = {@code 7}, Largest = {@code 7}</li>
 * </ul>
 */
public class FindLargestAndSmallest {

    public static void main(String[] args) {
        int[] arr = {32, 43, 53, 54, 32, 65, 63, 98, 43, 23};

        int[] minMax = findMinMax(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        if (minMax.length >= 2) {
            System.out.println("Smallest: " + minMax[0]);
            System.out.println("Largest:  " + minMax[1]);
        }
    }

    /**
     * Finds the minimum and maximum values in the array.
     *
     * @param arr the input array
     * @return int array where index 0 is min and index 1 is max
     */
    public static int[] findMinMax(int[] arr) {
        // TODO: Implement single-pass logic to find min and max
        return new int[]{};
    }
}
