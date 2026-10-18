package a8_tries.try02.java8;

import java.util.Arrays;
import java.util.List;

/**
 * <h2>Problem: Match Operations on Elements</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of integers, verify whether all elements, any element, or no elements satisfy given conditions.</p>
 *
 * <p><b>Expected Output:</b><br>
 * Boolean flags indicating whether all, any, or none of the elements satisfy the condition.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [2, 4, 6, 8], condition: even<br>
 *       Expected: allMatch = true, anyMatch = true, noneMatch = false</li>
 *   <li><b>Example 2:</b><br>
 *       Input: [1, 2, 3], condition: negative<br>
 *       Expected: noneMatch = true</li>
 * </ul>
 */
public class MatchOperations {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println("Numbers: " + numbers);
        System.out.println("All even?  " + areAllEven(numbers));
        System.out.println("Any > 5?   " + hasAnyGreaterThan(numbers, 5));
        System.out.println("None < 0?  " + hasNoneNegative(numbers));
    }

    /**
     * Checks if all elements are even.
     */
    public static boolean areAllEven(List<Integer> numbers) {
        // TODO: Implement logic
        return false;
    }

    /**
     * Checks if any element is greater than threshold.
     */
    public static boolean hasAnyGreaterThan(List<Integer> numbers, int threshold) {
        // TODO: Implement logic
        return false;
    }

    /**
     * Checks if no element is negative.
     */
    public static boolean hasNoneNegative(List<Integer> numbers) {
        // TODO: Implement logic
        return false;
    }
}
