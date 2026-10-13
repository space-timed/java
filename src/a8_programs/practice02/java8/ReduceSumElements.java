package a8_programs.practice02.java8;

import java.util.Arrays;
import java.util.List;

/**
 * <h2>Problem: Sum All Elements in a List</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of integers, calculate and return the total sum of all elements.</p>
 *
 * <p><b>Expected Output:</b><br>
 * An integer representing the total sum of elements.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [1, 2, 3, 4, 5]<br>
 *       Expected: 15</li>
 *   <li><b>Example 2:</b><br>
 *       Input: [10, -5, 20]<br>
 *       Expected: 25</li>
 *   <li><b>Example 3:</b><br>
 *       Input: []<br>
 *       Expected: 0</li>
 * </ul>
 */
public class ReduceSumElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = sumAll(numbers);
        System.out.println("Numbers: " + numbers);
        System.out.println("Sum:     " + sum);
    }

    /**
     * Sums all elements in a list.
     *
     * @param numbers list of integers
     * @return sum of all integers
     */
    public static int sumAll(List<Integer> numbers) {
        // TODO: Implement logic
        return 0;
    }
}
