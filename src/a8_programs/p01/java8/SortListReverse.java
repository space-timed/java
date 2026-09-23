package a8_programs.p01.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Sort the List in Reverse Order</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of comparable elements, sort them in descending (reverse) order.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list sorted in descending order.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [5, 2, 8, 1, 9]<br>
 *       Expected: [9, 8, 5, 2, 1]</li>
 *   <li><b>Example 2:</b><br>
 *       Input: ["A", "C", "B"]<br>
 *       Expected: ["C", "B", "A"]</li>
 * </ul>
 */
public class SortListReverse {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        List<Integer> sorted = sortDescending(numbers);
        System.out.println("Original:   " + numbers);
        System.out.println("Descending: " + sorted);
    }

    /**
     * Sorts list in reverse order.
     *
     * @param list list of integers
     * @return descending sorted list
     */
    public static List<Integer> sortDescending(List<Integer> list) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
