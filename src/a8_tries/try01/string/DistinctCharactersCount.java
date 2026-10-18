package a8_tries.try01.string;

import java.util.Collections;
import java.util.Map;

/**
 * <h2>Problem: Distinct Characters and Their Count</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to find all distinct (unique) characters present in a given string
 * and compute their individual frequencies/occurrence counts.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A Map where keys are the distinct characters and values are their respective frequency counts.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "hello"}<br>
 *       Expected: {@code {'h': 1, 'e': 1, 'l': 2, 'o': 1}}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "alpha beta gamma delta"}<br>
 *       Expected: Frequency map of all distinct characters in the sentence</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "aabbcc"}<br>
 *       Expected: {@code {'a': 2, 'b': 2, 'c': 2}}</li>
 * </ul>
 */
public class DistinctCharactersCount {

    public static void main(String[] args) {
        String input = "alpha beta gamma delta";

        Map<Character, Integer> charCounts = getDistinctCharactersCount(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Distinct characters and counts:");
        charCounts.forEach((ch, count) -> System.out.println("'" + ch + "' -> " + count));
    }

    /**
     * Finds each distinct character in the string and counts its occurrences.
     *
     * @param input the string to analyze
     * @return map of character to occurrence count
     */
    public static Map<Character, Integer> getDistinctCharactersCount(String input) {
        // TODO: Implement logic to count frequencies of distinct characters
        return Collections.emptyMap();
    }
}
