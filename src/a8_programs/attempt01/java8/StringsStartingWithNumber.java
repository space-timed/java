package a8_programs.attempt01.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Find Strings Which Start With Number</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of strings, filter and return all strings that start with a numeric digit.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list of strings starting with a number.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: ["one", "2two", "three", "4four"]<br>
 *       Expected: ["2two", "4four"]</li>
 * </ul>
 */
public class StringsStartingWithNumber {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "2two", "three", "4four", "5five");
        List<String> result = findStartingWithDigit(list);
        System.out.println("List: " + list);
        System.out.println("Strings starting with digit: " + result);
    }

    /**
     * Finds strings starting with a digit.
     *
     * @param list input list of strings
     * @return list of strings starting with digit
     */
    public static List<String> findStartingWithDigit(List<String> list) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
