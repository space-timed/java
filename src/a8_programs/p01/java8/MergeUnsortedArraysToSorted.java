package a8_programs.p01.java8;

import java.util.Arrays;

/**
 * <h2>Problem: Merge Two Unsorted Arrays Into Single Sorted Array</h2>
 *
 * <p><b>Description:</b><br>
 * Given two unsorted integer arrays, merge them into a single sorted array containing all elements.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A single sorted primitive int array containing all elements.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: a = [5, 1, 9], b = [8, 3, 2]<br>
 *       Expected: [1, 2, 3, 5, 8, 9]</li>
 * </ul>
 */
public class MergeUnsortedArraysToSorted {

    public static void main(String[] args) {
        int[] a = {5, 1, 9};
        int[] b = {8, 3, 2};
        int[] merged = mergeAndSort(a, b);
        System.out.println("Array A: " + Arrays.toString(a));
        System.out.println("Array B: " + Arrays.toString(b));
        System.out.println("Merged & Sorted: " + Arrays.toString(merged));
    }

    /**
     * Merges and sorts two unsorted integer arrays.
     *
     * @param a first array
     * @param b second array
     * @return sorted merged array
     */
    public static int[] mergeAndSort(int[] a, int[] b) {
        // TODO: Implement logic
        return new int[0];
    }
}
