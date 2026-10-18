package a8_tries.try03.java8;

import java.util.Arrays;
import java.util.Optional;

/**
 * <h2>Problem: Last Element of an Array</h2>
 *
 * <p><b>Description:</b><br>
 * Retrieve the last element from an array.</p>
 *
 * <p><b>Expected Output:</b><br>
 * An Optional containing the last element.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [10, 20, 30, 40, 50]<br>
 *       Expected: Optional[50]</li>
 * </ul>
 */
public class LastElementOfArray {

    public static void main(String[] args) {
        String[] items = {"first", "second", "third", "last"};
        Optional<String> last = getLastElement(items);
        System.out.println("Array: " + Arrays.toString(items));
        System.out.println("Last element: " + last.orElse(null));
    }

    /**
     * Finds last element of array.
     *
     * @param arr array of elements
     * @param <T> element type
     * @return Optional of last element
     */
    public static <T> Optional<T> getLastElement(T[] arr) {
        // TODO: Implement logic
        return Optional.empty();
    }
}
