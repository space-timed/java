package a8_programs.p01.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/**
 * <h2>Problem: Find Repeated Numbers in an Array with Multiple Duplicates</h2>
 *
 * <p><b>Description:</b><br>
 * Given an integer array that may contain multiple duplicate elements, find all numbers
 * that appear more than once in the array. Can be solved using HashSet, HashMap frequency count,
 * or sorting.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A set or collection of distinct numbers that occur more than once.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code [1, 2, 3, 1, 3, 6, 6]}<br>
 *       Expected: {@code [1, 3, 6]}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code [1, 2, 3, 4, 5]}<br>
 *       Expected: {@code []}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code [4, 4, 4, 4]}<br>
 *       Expected: {@code [4]}</li>
 * </ul>
 */
public class FindMultipleDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 6, 6};

        Set<Integer> duplicates = findDuplicates(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Repeated numbers: " + duplicates);
    }

    /**
     * Identifies all repeated numbers from the given array.
     *
     * @param arr the input array
     * @return a Set of numbers that appear more than once
     */
    public static Set<Integer> findDuplicates(int[] arr) {
        // TODO: Implement logic using HashSet or frequency map
        return Collections.emptySet();
    }
}
