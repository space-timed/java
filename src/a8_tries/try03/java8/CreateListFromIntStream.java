package a8_tries.try03.java8;

import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Create a List from a Range of Numbers</h2>
 *
 * <p><b>Description:</b><br>
 * Generate a list of integers containing all numbers in the specified range from start to end (inclusive).</p>
 *
 * <p><b>Expected Output:</b><br>
 * A List<Integer> containing numbers in the specified range.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: range 1 to 5 (inclusive)<br>
 *       Expected: [1, 2, 3, 4, 5]</li>
 *   <li><b>Example 2:</b><br>
 *       Input: range 10 to 12<br>
 *       Expected: [10, 11, 12]</li>
 * </ul>
 */
public class CreateListFromIntStream {

    public static void main(String[] args) {
        List<Integer> list = createRangeList(1, 5);
        System.out.println("Range 1 to 5 as List: " + list);
    }

    /**
     * Generates a List from a range of numbers.
     *
     * @param start start of range (inclusive)
     * @param end   end of range (inclusive)
     * @return List of integers
     */
    public static List<Integer> createRangeList(int start, int end) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
