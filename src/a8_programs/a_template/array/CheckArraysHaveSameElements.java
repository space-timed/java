package a8_programs.a_template.array;

import java.util.Arrays;

/**
 * <h2>Problem: Check If Two Arrays Contain the Same Elements</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program that checks whether two integer arrays contain the same elements with the
 * same frequencies, irrespective of the order of elements (e.g. by sorting both arrays or using
 * frequency counting via HashMap).</p>
 *
 * <p><b>Expected Output:</b><br>
 * A boolean: {@code true} if both arrays contain the identical multiset of elements, otherwise {@code false}.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code arr1 = [1, 2, 3, 4]}, {@code arr2 = [4, 2, 1, 3]}<br>
 *       Expected: {@code true}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code arr1 = [1, 2, 2, 3]}, {@code arr2 = [1, 2, 3, 3]}<br>
 *       Expected: {@code false}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code arr1 = [1, 5, 9]}, {@code arr2 = [1, 5]}<br>
 *       Expected: {@code false}</li>
 * </ul>
 */
public class CheckArraysHaveSameElements {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 2, 1, 3};

        boolean same = haveSameElements(arr1, arr2);
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Contain same elements: " + same);
    }

    /**
     * Checks if two arrays contain the same elements with the same frequencies.
     *
     * @param arr1 first integer array
     * @param arr2 second integer array
     * @return true if both arrays contain identical elements, false otherwise
     */
    public static boolean haveSameElements(int[] arr1, int[] arr2) {
        // TODO: Implement logic using sorting or frequency map comparison
        return false;
    }
}
