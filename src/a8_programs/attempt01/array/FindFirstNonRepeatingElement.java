package a8_programs.attempt01.array;

import java.util.Arrays;

/**
 * <h2>Problem: Find First Non-Repeating Element in an Array</h2>
 *
 * <p><b>Description:</b><br>
 * Given an array of integers, find the first element that does not repeat (has a frequency of exactly 1).
 * If all elements repeat, return {@code -1}.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The first non-repeating integer value, or {@code -1} if none exists.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code [-1, 2, -1, 3, 2]}<br>
 *       Expected: {@code 3}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code [9, 4, 9, 6, 7, 4]}<br>
 *       Expected: {@code 6}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code [1, 1, 2, 2]}<br>
 *       Expected: {@code -1}</li>
 * </ul>
 */
public class FindFirstNonRepeatingElement {

    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 2};

        int result = findFirstNonRepeating(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("First non-repeating element: " + result);
    }

    /**
     * Finds the first non-repeating element in the array.
     *
     * @param arr the input array
     * @return the first non-repeating integer, or -1 if no unique element exists
     */
    public static int findFirstNonRepeating(int[] arr) {
        // TODO: Implement frequency map / LinkedHashMap logic to find the first non-repeating element
        return -1;
    }
}
