package a8_programs.practice01.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Convert List of Strings to Uppercase</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of strings, convert each string in the list to its uppercase equivalent.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A new list with all string elements converted to uppercase.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: ["java", "python", "stream"]<br>
 *       Expected: ["JAVA", "PYTHON", "STREAM"]</li>
 *   <li><b>Example 2:</b><br>
 *       Input: ["Hello", "World"]<br>
 *       Expected: ["HELLO", "WORLD"]</li>
 *   <li><b>Example 3:</b><br>
 *       Input: []<br>
 *       Expected: []</li>
 * </ul>
 */
public class ConvertStringsToUppercase {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "python", "stream", "lambda");
        List<String> upper = convertToUppercase(words);
        System.out.println("Original:  " + words);
        System.out.println("Uppercase: " + upper);
    }

    /**
     * Converts all strings in the list to uppercase.
     *
     * @param list list of strings
     * @return list of uppercase strings
     */
    public static List<String> convertToUppercase(List<String> list) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
