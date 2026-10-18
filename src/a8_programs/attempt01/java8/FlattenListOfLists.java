package a8_programs.attempt01.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Flatten a List of Lists</h2>
 *
 * <p><b>Description:</b><br>
 * Given a nested list containing multiple sublists, flatten all elements into a single list.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A single flattened list containing all elements from the nested sublists in order.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [[1, 2], [3, 4], [5]]<br>
 *       Expected: [1, 2, 3, 4, 5]</li>
 *   <li><b>Example 2:</b><br>
 *       Input: [["a", "b"], ["c"]]<br>
 *       Expected: ["a", "b", "c"]</li>
 * </ul>
 */
public class FlattenListOfLists {

    public static void main(String[] args) {
        List<List<Integer>> nested = Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(3, 4),
            Arrays.asList(5, 6)
        );
        List<Integer> flat = flatten(nested);
        System.out.println("Nested:    " + nested);
        System.out.println("Flattened: " + flat);
    }

    /**
     * Flattens a list of lists into a single list.
     *
     * @param nestedList nested list of sublists
     * @param <T>        element type
     * @return flattened list
     */
    public static <T> List<T> flatten(List<List<T>> nestedList) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
