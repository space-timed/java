package a8_programs.attempt01.array;

import java.util.Arrays;

/**
 * <h2>Problem: Find the First Repeating Element in an Array</h2>
 *
 * <p><b>Description:</b><br>
 * Given an array of integers, find the first repeating element. That is, find the element
 * that occurs more than once and whose first occurrence has the smallest index (or using a HashSet
 * to identify the first element encountered that was already seen).</p>
 *
 * <p><b>Expected Output:</b><br>
 * The first integer that repeats, or {@code -1} if no element repeats.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code [10, 5, 3, 4, 3, 5, 6]}<br>
 *       Expected: {@code 5} (5 occurs first at index 1, whereas 3 occurs at index 2)</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code [6, 10, 5, 4, 9, 120, 4, 6, 10]}<br>
 *       Expected: {@code 6} (6 occurs at index 0)</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code [1, 2, 3, 4]}<br>
 *       Expected: {@code -1} (no repeating elements)</li>
 * </ul>
 */
public class FindFirstRepeatingElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        int firstRepeating = findFirstRepeating(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("First repeating element: " + firstRepeating);
    }

    /**
     * Finds the first repeating element in the array.
     *
     * @param arr the input integer array
     * @return the first repeating element, or -1 if none exists
     */
    public static int findFirstRepeating(int[] arr) {
        // TODO: Implement logic using HashSet traversing from right to left or frequency map
        return -1;
    }
}
