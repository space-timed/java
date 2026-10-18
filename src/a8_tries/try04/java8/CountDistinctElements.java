package a8_tries.try04.java8;

import java.util.Arrays;
import java.util.List;

/**
 * <h2>Problem: Count Distinct Elements</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of elements, count the total number of unique (distinct) elements present.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A long integer indicating the count of unique elements.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [1, 2, 2, 3, 4, 4, 4, 5]<br>
 *       Expected: 5</li>
 *   <li><b>Example 2:</b><br>
 *       Input: ["a", "b", "a", "c"]<br>
 *       Expected: 3</li>
 * </ul>
 */
public class CountDistinctElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
        long count = countDistinct(numbers);
        System.out.println("Numbers: " + numbers);
        System.out.println("Distinct count: " + count);
    }

    /**
     * Counts unique elements in the given list.
     *
     * @param list input list
     * @param <T>  element type
     * @return count of distinct elements
     */
    public static <T> long countDistinct(List<T> list) {
        // TODO: Implement logic
        return 0L;
    }
}
