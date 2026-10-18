package a8_tries.try01.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Filter and Print Even Numbers</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of integers, filter and extract only the even numbers.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list containing only the even integers.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]<br>
 *       Expected: [2, 4, 6, 8, 10]</li>
 *   <li><b>Example 2:</b><br>
 *       Input: [1, 3, 5]<br>
 *       Expected: []</li>
 *   <li><b>Example 3:</b><br>
 *       Input: [2, 4, 6]<br>
 *       Expected: [2, 4, 6]</li>
 * </ul>
 */
public class FilterEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evens = filterEvenNumbers(numbers);
        System.out.println("Original list: " + numbers);
        System.out.println("Even numbers:  " + evens);
    }

    /**
     * Filters even numbers from the provided list.
     *
     * @param numbers list of integers
     * @return list containing only even integers
     */
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
