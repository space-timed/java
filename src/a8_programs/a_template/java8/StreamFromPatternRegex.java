package a8_programs.a_template.java8;

import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Stream from a Pattern Regex</h2>
 *
 * <p><b>Description:</b><br>
 * Split a delimited string into a list of individual tokens based on a regular expression pattern.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list of tokens split by regex.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: "apple,banana,orange", regex = ","<br>
 *       Expected: ["apple", "banana", "orange"]</li>
 * </ul>
 */
public class StreamFromPatternRegex {

    public static void main(String[] args) {
        String input = "apple,banana,orange,grape";
        List<String> tokens = splitAsStream(input, ",");
        System.out.println("Input:  " + input);
        System.out.println("Tokens: " + tokens);
    }

    /**
     * Splits input into a list using regex pattern.
     *
     * @param input source string
     * @param regex delimiter regex
     * @return list of split tokens
     */
    public static List<String> splitAsStream(String input, String regex) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
