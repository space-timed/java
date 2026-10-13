package a8_programs.practice02.string;

import java.util.Collections;
import java.util.Map;

/**
 * <h2>Problem: Find Duplicate Words and Their Occurrences</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to find duplicate words and their frequency of occurrence in a given string sentence.
 * Words that appear only once should not be reported as duplicates.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A Map containing only words that occur more than once, mapped to their count.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "alpha beta gamma alpha beta delta omega"}<br>
 *       Expected: {@code {"alpha": 2, "beta": 2}}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "to be or not to be that is the question"}<br>
 *       Expected: {@code {"to": 2, "be": 2}}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "one two three"}<br>
 *       Expected: {@code {}} (no duplicate words)</li>
 * </ul>
 */
public class FindDuplicateWords {

    public static void main(String[] args) {
        String input = "alpha beta gamma alpha beta delta omega";

        Map<String, Integer> duplicates = findDuplicateWords(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Duplicate words and their counts:");
        duplicates.forEach((word, count) -> System.out.println("\"" + word + "\" -> " + count));
    }

    /**
     * Finds words that occur more than once in the given string along with their counts.
     *
     * @param input the input sentence
     * @return map of duplicate words and their occurrence counts
     */
    public static Map<String, Integer> findDuplicateWords(String input) {
        // TODO: Implement logic to extract duplicate words and frequencies (e.g. using Map or Java 8 Streams)
        return Collections.emptyMap();
    }
}
