package a8_programs.practice02.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * <h2>Problem: Find the First Element in a List</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of elements, find and return the first element.</p>
 *
 * <p><b>Expected Output:</b><br>
 * An Optional containing the first element, or empty if the list is empty.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: ["alpha", "beta", "gamma"]<br>
 *       Expected: Optional["alpha"]</li>
 *   <li><b>Example 2:</b><br>
 *       Input: []<br>
 *       Expected: Optional.empty</li>
 * </ul>
 */
public class FindFirstElement {

    public static void main(String[] args) {
        List<String> items = Arrays.asList("alpha", "beta", "gamma");
        Optional<String> first = findFirst(items);
        System.out.println("List: " + items);
        System.out.println("First element: " + first.orElse("None"));
    }

    /**
     * Finds the first element in the list.
     *
     * @param list input list
     * @param <T>  element type
     * @return Optional containing the first element
     */
    public static <T> Optional<T> findFirst(List<T> list) {
        // TODO: Implement logic
        return Optional.empty();
    }
}
