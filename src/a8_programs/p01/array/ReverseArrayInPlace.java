package a8_programs.p01.array;

import java.util.Arrays;

/**
 * <h2>Problem: Reverse Array in Place</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to reverse an array in-place, meaning no additional array is allocated
 * (O(1) auxiliary space complexity). Typically implemented using two pointers (left and right)
 * swapping elements until they meet in the middle.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The same array with its elements arranged in reverse order.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code [1, 2, 3, 4, 5]}<br>
 *       Expected: {@code [5, 4, 3, 2, 1]}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code [10, 20]}<br>
 *       Expected: {@code [20, 10]}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code [7]}<br>
 *       Expected: {@code [7]}</li>
 * </ul>
 */
public class ReverseArrayInPlace {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(arr));
        reverseInPlace(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    /**
     * Reverses the given array in place.
     *
     * @param arr the array to reverse in-place
     */
    public static void reverseInPlace(int[] arr) {
        // TODO: Implement two-pointer swapping logic to reverse array in place
    }
}
