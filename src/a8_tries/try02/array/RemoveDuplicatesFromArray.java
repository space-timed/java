package a8_tries.try02.array;

import java.util.Arrays;

/**
 * <h2>Problem: Remove Duplicates from an Array in Java</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to remove all duplicate elements from an array so that each element
 * appears only once. The resulting array can preserve the original order or be sorted.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A new integer array containing only the unique elements.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code [1, 2, 2, 3, 4, 4, 5]}<br>
 *       Expected: {@code [1, 2, 3, 4, 5]}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code [4, 5, 4, 6, 7, 5]}<br>
 *       Expected: {@code [4, 5, 6, 7]}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code [1, 1, 1, 1]}<br>
 *       Expected: {@code [1]}</li>
 * </ul>
 */
public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Unique array:   " + Arrays.toString(uniqueArr));
    }

    /**
     * Removes duplicates from the given array.
     *
     * @param arr the input array containing duplicates
     * @return a new array containing unique elements
     */
    public static int[] removeDuplicates(int[] arr) {
        // TODO: Implement logic using LinkedHashSet, Streams, or in-place two-pointer technique
        return new int[]{};
    }
}
