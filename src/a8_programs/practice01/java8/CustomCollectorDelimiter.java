package a8_programs.practice01.java8;

import java.util.Arrays;
import java.util.List;

/**
 * <h2>Problem: Custom String Concatenation with Delimiter</h2>
 *
 * <p><b>Description:</b><br>
 * Concatenate a list of strings into a single string using a custom delimiter.</p>
 *
 * <p><b>Expected Output:</b><br>
 * Concatenated string result.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: ["A", "B", "C"], delimiter: "-"<br>
 *       Expected: "A-B-C"</li>
 * </ul>
 */
public class CustomCollectorDelimiter {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        String result = joinWithCustomCollector(list, "-");
        System.out.println("List: " + list);
        System.out.println("Result: " + result);
    }

    /**
     * Concatenates strings using a delimiter.
     *
     * @param list      list of strings
     * @param delimiter delimiter string
     * @return joined string
     */
    public static String joinWithCustomCollector(List<String> list, String delimiter) {
        // TODO: Implement logic
        return "";
    }
}
