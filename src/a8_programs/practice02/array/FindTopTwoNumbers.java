package a8_programs.practice02.array;

import java.util.Arrays;

/**
 * <h2>Problem: Find Top Two Numbers from an Integer Array</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to find the top two numbers (maximum and second maximum) from an integer array
 * in a single pass without sorting the entire array (O(n) time complexity).</p>
 *
 * <p><b>Expected Output:</b><br>
 * A 2-element array containing {@code [largest, secondLargest]}.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code [5, 3, 9, 1, 12]}<br>
 *       Expected: {@code [12, 9]}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code [20, 34, 21, 87, 92, 45]}<br>
 *       Expected: {@code [92, 87]}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code [-5, -1, -10, -2]}<br>
 *       Expected: {@code [-1, -2]}</li>
 * </ul>
 */
public class FindTopTwoNumbers {

    public static void main(String[] args) {
        int[] arr = {20, 34, 21, 87, 92, 45};

        int[] topTwo = findTopTwo(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Top two numbers: " + Arrays.toString(topTwo));
    }

    /**
     * Finds the largest and second largest numbers in an array.
     *
     * @param arr the input array
     * @return array containing [max, secondMax]
     */
    public static int[] findTopTwo(int[] arr) {
        // TODO: Implement single-pass logic to track highest and second highest numbers
        return new int[]{};
    }
}
