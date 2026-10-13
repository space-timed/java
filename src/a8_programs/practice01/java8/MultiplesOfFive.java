package a8_programs.practice01.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Print Multiples of 5 From the List</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of integers, filter and extract only the numbers that are multiples of 5.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list of integers divisible by 5.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [10, 14, 25, 33, 50, 62]<br>
 *       Expected: [10, 25, 50]</li>
 *   <li><b>Example 2:</b><br>
 *       Input: [1, 2, 3]<br>
 *       Expected: []</li>
 * </ul>
 */
public class MultiplesOfFive {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 14, 25, 33, 50, 62);
        List<Integer> multiples = findMultiplesOfFive(numbers);
        System.out.println("Numbers: " + numbers);
        System.out.println("Multiples of 5: " + multiples);
    }

    /**
     * Filters multiples of 5.
     *
     * @param list input list
     * @return list of multiples of 5
     */
    public static List<Integer> findMultiplesOfFive(List<Integer> list) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
