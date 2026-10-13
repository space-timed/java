package a11_template.programs.java8;

import java.util.Collections;
import java.util.Map;

/**
 * <h2>Problem: Count Number of Occurrences of Each Letter in a String</h2>
 *
 * <p><b>Description:</b><br>
 * Count the frequency of each alphabetic letter in a string, ignoring case and non-letter characters.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A Map<Character, Long> of letter counts.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: "Java 8 Streams!"<br>
 *       Expected: frequency map of letters ('a'=3, 'e'=1, 'j'=1, 'm'=1, 'r'=1, 's'=2, 't'=1, 'v'=1)</li>
 * </ul>
 */
public class LetterOccurrencesCount {

    public static void main(String[] args) {
        String text = "Java 8 Streams!";
        Map<Character, Long> letterCounts = countLetters(text);
        System.out.println("Text: " + text);
        System.out.println("Letter counts: " + letterCounts);
    }

    /**
     * Counts occurrences of each letter.
     *
     * @param input source string
     * @return map of letter to count
     */
    public static Map<Character, Long> countLetters(String input) {
        // TODO: Implement logic
        return Collections.emptyMap();
    }
}
