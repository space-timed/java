package a11_template.programs.java8;

import java.util.Arrays;
import java.util.List;

/**
 * <h2>Problem: Convert a Collection to an Array</h2>
 *
 * <p><b>Description:</b><br>
 * Convert a list of strings into an array of strings.</p>
 *
 * <p><b>Expected Output:</b><br>
 * An array containing all strings from the list.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: ["one", "two", "three"]<br>
 *       Expected: String[] {"one", "two", "three"}</li>
 * </ul>
 */
public class ConvertStreamToArray {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");
        String[] arr = toArray(list);
        System.out.println("List:  " + list);
        System.out.println("Array: " + Arrays.toString(arr));
    }

    /**
     * Converts a list of strings to an array.
     *
     * @param list list of strings
     * @return array of strings
     */
    public static String[] toArray(List<String> list) {
        // TODO: Implement logic
        return new String[0];
    }
}
