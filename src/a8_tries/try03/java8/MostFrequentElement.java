package a8_tries.try03.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * <h2>Problem: Find the Most Frequent Element in a List</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of elements, find the element that occurs with the highest frequency.</p>
 *
 * <p><b>Expected Output:</b><br>
 * An Optional containing the most frequent element.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [1, 3, 2, 1, 4, 1, 3]<br>
 *       Expected: Optional[1] (occurs 3 times)</li>
 * </ul>
 */
public class MostFrequentElement {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 1, 4, 1, 3);
        Optional<Integer> mostFrequent = findMostFrequent(list);
        System.out.println("List: " + list);
        System.out.println("Most frequent element: " + mostFrequent.orElse(null));
    }

    /**
     * Finds the most frequent element in the list.
     *
     * @param list input list
     * @param <T>  element type
     * @return Optional of the most frequent element
     */
    public static <T> Optional<T> findMostFrequent(List<T> list) {
        // TODO: Implement logic
        return Optional.empty();
    }
}
