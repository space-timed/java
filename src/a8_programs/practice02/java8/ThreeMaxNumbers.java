package a8_programs.practice02.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Three Maximum Numbers From the List</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of integers, find the 3 largest distinct numbers.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list of the 3 largest integers.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [12, 4, 7, 2, 9, 2, 1, 15]<br>
 *       Expected: [15, 12, 9]</li>
 * </ul>
 */
public class ThreeMaxNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 4, 7, 2, 9, 2, 1, 15);
        List<Integer> max3 = findThreeMax(numbers);
        System.out.println("Numbers: " + numbers);
        System.out.println("3 Max numbers: " + max3);
    }

    /**
     * Finds 3 maximum distinct numbers.
     *
     * @param list input numbers
     * @return list of 3 maximums
     */
    public static List<Integer> findThreeMax(List<Integer> list) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
