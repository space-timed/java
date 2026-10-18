package a8_programs.attempt01.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * <h2>Problem: Find Any Element in a Collection</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of elements, retrieve any element from the collection.</p>
 *
 * <p><b>Expected Output:</b><br>
 * An Optional containing any element from the collection, or empty if the collection is empty.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [10, 20, 30, 40]<br>
 *       Expected: Optional containing any one of [10, 20, 30, 40]</li>
 *   <li><b>Example 2:</b><br>
 *       Input: []<br>
 *       Expected: Optional.empty</li>
 * </ul>
 */
public class FindAnyElement {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        Optional<Integer> any = findAny(numbers);
        System.out.println("Numbers: " + numbers);
        System.out.println("Any element: " + any.orElse(null));
    }

    /**
     * Returns any element from the given list.
     *
     * @param list input list
     * @param <T>  element type
     * @return Optional containing any element
     */
    public static <T> Optional<T> findAny(List<T> list) {
        // TODO: Implement logic
        return Optional.empty();
    }
}
