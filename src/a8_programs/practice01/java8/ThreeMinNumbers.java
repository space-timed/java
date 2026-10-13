package a8_programs.practice01.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Three Minimum Numbers From the List</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of integers, find the 3 smallest distinct numbers.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list of the 3 smallest integers.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [12, 4, 7, 2, 9, 2, 1, 15]<br>
 *       Expected: [1, 2, 4]</li>
 * </ul>
 */
public class ThreeMinNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 4, 7, 2, 9, 2, 1, 15);
        List<Integer> min3 = findThreeMin(numbers);
        System.out.println("Numbers: " + numbers);
        System.out.println("3 Min numbers: " + min3);
    }

    /**
     * Finds 3 minimum distinct numbers.
     *
     * @param list input numbers
     * @return list of 3 minimums
     */
    public static List<Integer> findThreeMin(List<Integer> list) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
