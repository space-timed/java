package a8_programs.attempt02.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Concatenate Two Sequences</h2>
 *
 * <p><b>Description:</b><br>
 * Combine two collections of elements into a single continuous list maintaining original order.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A single list containing elements of first list followed by second list.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: list1 = ["A", "B"], list2 = ["C", "D"]<br>
 *       Expected: ["A", "B", "C", "D"]</li>
 * </ul>
 */
public class ConcatenateStreams {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B");
        List<String> list2 = Arrays.asList("C", "D");
        List<String> combined = concatenate(list1, list2);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Concatenated: " + combined);
    }

    /**
     * Concatenates two lists into a single list.
     *
     * @param list1 first list
     * @param list2 second list
     * @param <T>   element type
     * @return combined list
     */
    public static <T> List<T> concatenate(List<T> list1, List<T> list2) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
