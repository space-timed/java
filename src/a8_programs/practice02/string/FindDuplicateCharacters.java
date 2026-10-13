package a8_programs.practice02.string;

import java.util.Collections;
import java.util.Map;

/**
 * <h2>Problem: Find Duplicate Characters in a String</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to find all duplicate characters in a given string and their respective count.
 * Only characters that appear more than once should be reported.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A Map of duplicate characters mapped to their occurrences (frequency &gt; 1).</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "programming"}<br>
 *       Expected: {@code {'r': 2, 'g': 2, 'm': 2}}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "Java"}<br>
 *       Expected: {@code {'a': 2}}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "abcdef"}<br>
 *       Expected: {@code {}} (no duplicates)</li>
 * </ul>
 */
public class FindDuplicateCharacters {

    public static void main(String[] args) {
        String input = "programming";

        Map<Character, Integer> duplicates = findDuplicateCharacters(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Duplicate characters and their counts:");
        duplicates.forEach((ch, count) -> System.out.println("'" + ch + "' -> " + count + " times"));
    }

    /**
     * Finds all characters appearing more than once in the input string.
     *
     * @param input the string to inspect
     * @return map of duplicate characters and their counts
     */
    public static Map<Character, Integer> findDuplicateCharacters(String input) {
        // TODO: Implement logic to find duplicate characters and frequencies (no solution provided)
        return Collections.emptyMap();
    }
}
