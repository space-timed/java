package a11_template.programs.java8;

import java.util.Arrays;
import java.util.List;

/**
 * <h2>Problem: Create a Formatted String from a List of Strings</h2>
 *
 * <p><b>Description:</b><br>
 * Combine a list of strings into a single string formatted with a given delimiter, prefix, and suffix.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A single formatted string.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: ["apple", "banana", "cherry"], delimiter: ", ", prefix: "[", suffix: "]"<br>
 *       Expected: "[apple, banana, cherry]"</li>
 * </ul>
 */
public class JoinStringsWithCollector {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        String result = joinWithCustomFormat(fruits, ", ", "[", "]");
        System.out.println("List: " + fruits);
        System.out.println("Joined: " + result);
    }

    /**
     * Joins strings with delimiter, prefix, and suffix.
     *
     * @param list      list of strings
     * @param delimiter delimiter string
     * @param prefix    prefix string
     * @param suffix    suffix string
     * @return formatted string
     */
    public static String joinWithCustomFormat(List<String> list, String delimiter, String prefix, String suffix) {
        // TODO: Implement logic
        return "";
    }
}
