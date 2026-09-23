package a8_programs.a_template.array;

import java.util.Arrays;

/**
 * <h2>Problem: Check If Array Contains a Number</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to determine whether a given integer array contains a specific target value.
 * Can be solved using linear search, binary search (if sorted), or Java Streams.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A boolean: {@code true} if the target exists in the array, otherwise {@code false}.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code arr = [5, 1, 19, 25, 12]}, {@code target = 25}<br>
 *       Expected: {@code true}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code arr = [5, 1, 19, 25, 12]}, {@code target = 100}<br>
 *       Expected: {@code false}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code arr = []}, {@code target = 1}<br>
 *       Expected: {@code false}</li>
 * </ul>
 */
public class CheckArrayContainsNumber {

    public static void main(String[] args) {
        int[] arr = {5, 1, 19, 25, 12};
        int target = 25;

        boolean found = contains(arr, target);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Contains " + target + "? " + found);
    }

    /**
     * Checks if the array contains the target number.
     *
     * @param arr    the array of integers
     * @param target the number to search for
     * @return true if target exists in array, false otherwise
     */
    public static boolean contains(int[] arr, int target) {
        // TODO: Implement linear search or stream-based lookup
        return false;
    }
}
