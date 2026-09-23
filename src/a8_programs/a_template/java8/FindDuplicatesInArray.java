package a8_programs.a_template.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/**
 * <h2>Problem: Find Duplicate Elements From an Array</h2>
 *
 * <p><b>Description:</b><br>
 * Given an array of integers, find and return all elements that appear more than once.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A Set of duplicate elements.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [1, 2, 3, 2, 4, 5, 1]<br>
 *       Expected: [1, 2]</li>
 * </ul>
 */
public class FindDuplicatesInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        Set<Integer> duplicates = findDuplicates(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Duplicates: " + duplicates);
    }

    /**
     * Finds duplicate elements in array.
     *
     * @param arr input array
     * @return set of duplicates
     */
    public static Set<Integer> findDuplicates(int[] arr) {
        // TODO: Implement logic
        return Collections.emptySet();
    }
}
