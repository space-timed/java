package a8_programs.p01.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Perform an Action Without Altering Elements</h2>
 *
 * <p><b>Description:</b><br>
 * Process a collection of elements and perform an intermediate inspection or side action without altering the elements.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The collection of elements after processing, while side actions were executed.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [1, 2, 3, 4]<br>
 *       Expected: logs intermediate elements and returns [2, 4, 6, 8]</li>
 * </ul>
 */
public class PeekStreamAction {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = inspectAndTransform(numbers);
        System.out.println("Final result: " + result);
    }

    /**
     * Inspects intermediate elements and transforms the list.
     *
     * @param numbers input integers
     * @return transformed integers
     */
    public static List<Integer> inspectAndTransform(List<Integer> numbers) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
