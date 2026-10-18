package a8_tries.try04.array;

import java.util.Arrays;

/**
 * <h2>Problem: Find Duplicate Number in Integer Array</h2>
 *
 * <p><b>Description:</b><br>
 * Given an array of integers containing {@code n + 1} integers where each integer is in the range
 * {@code [1, n]} inclusive, prove that at least one duplicate number must exist. Write a program
 * to find the duplicate number (e.g. using HashSet, sorting, or Floyd's Tortoise and Hare cycle detection).</p>
 *
 * <p><b>Expected Output:</b><br>
 * The integer that appears more than once.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code [1, 3, 4, 2, 2]}<br>
 *       Expected: {@code 2}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code [3, 1, 3, 4, 2]}<br>
 *       Expected: {@code 3}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code [3, 3, 3, 3, 3]}<br>
 *       Expected: {@code 3}</li>
 * </ul>
 */
public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        int duplicate = findDuplicate(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Duplicate number: " + duplicate);
    }

    /**
     * Finds the duplicate number in the given array.
     *
     * @param arr array containing duplicate element
     * @return the duplicate integer value, or -1 if none found
     */
    public static int findDuplicate(int[] arr) {
        // TODO: Implement logic to find the duplicate element
        return -1;
    }
}
