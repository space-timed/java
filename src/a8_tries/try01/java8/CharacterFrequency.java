package a8_tries.try01.java8;

import java.util.Collections;
import java.util.Map;

/**
 * <h2>Problem: Frequency of Each Character in String</h2>
 *
 * <p><b>Description:</b><br>
 * Count the frequency of each character in a given string.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A Map<Character, Long> of character frequencies.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: "hello"<br>
 *       Expected: {'h': 1, 'e': 1, 'l': 2, 'o': 1}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: "banana"<br>
 *       Expected: {'b': 1, 'a': 3, 'n': 2}</li>
 * </ul>
 */
public class CharacterFrequency {

    public static void main(String[] args) {
        String input = "banana";
        Map<Character, Long> freq = getCharFrequency(input);
        System.out.println("Input: " + input);
        System.out.println("Character frequency: " + freq);
    }

    /**
     * Calculates character frequencies in a string.
     *
     * @param input source string
     * @return map from character to count
     */
    public static Map<Character, Long> getCharFrequency(String input) {
        // TODO: Implement logic
        return Collections.emptyMap();
    }
}
