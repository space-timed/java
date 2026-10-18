package a8_programs.attempt01.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Find All Pairs Whose Sum Is Equal to Given Number</h2>
 *
 * <p><b>Description:</b><br>
 * Given an integer array and a target sum, find all pairs of elements whose sum equals
 * the specified target number. Can be solved using nested loops O(n^2), sorting with two pointers O(n log n),
 * or HashSet/HashMap O(n).</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list of integer pairs (represented as 2-element arrays) whose sum matches the target.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code arr = [2, 6, 3, 9, 11]}, {@code targetSum = 9}<br>
 *       Expected: {@code [[6, 3]]}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code arr = [1, 5, 7, -1, 5]}, {@code targetSum = 6}<br>
 *       Expected: {@code [[1, 5], [7, -1], [1, 5]]}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code arr = [1, 2, 3]}, {@code targetSum = 10}<br>
 *       Expected: {@code []}</li>
 * </ul>
 */
public class FindPairsWithSum {

    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 9, 11};
        int targetSum = 9;

        List<int[]> pairs = findPairs(arr, targetSum);
        System.out.println("Array: " + Arrays.toString(arr) + ", Target Sum: " + targetSum);
        System.out.println("Pairs found:");
        pairs.forEach(pair -> System.out.println(Arrays.toString(pair)));
    }

    /**
     * Finds all pairs in the array that sum up to targetSum.
     *
     * @param arr       input array of integers
     * @param targetSum the desired pair sum
     * @return list of integer pairs summing to targetSum
     */
    public static List<int[]> findPairs(int[] arr, int targetSum) {
        // TODO: Implement HashSet or two-pointer approach to find pairs with target sum
        return Collections.emptyList();
    }
}
