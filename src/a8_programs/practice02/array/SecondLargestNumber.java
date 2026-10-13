package a8_programs.practice02.array;

import java.util.Arrays;

/**
 * <h2>Problem: Find the Second Largest Number in an Array</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to find the second largest distinct number in an integer array
 * in a single traversal (O(n) time complexity) without sorting.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The second largest distinct integer value in the array, or {@code Integer.MIN_VALUE} if none exists.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code [12, 35, 1, 10, 34, 1]}<br>
 *       Expected: {@code 34}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code [10, 5, 10]}<br>
 *       Expected: {@code 5}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code [10, 10, 10]}<br>
 *       Expected: No distinct second largest (returns {@code Integer.MIN_VALUE})</li>
 * </ul>
 */
public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int secondLargest = findSecondLargest(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Second largest number: " + secondLargest);
    }

    /**
     * Finds the second largest distinct number in the array.
     *
     * @param arr the input array
     * @return the second largest distinct integer
     */
    public static int findSecondLargest(int[] arr) {
        // TODO: Implement single-pass logic tracking largest and second largest distinct elements
        return Integer.MIN_VALUE;
    }
}
