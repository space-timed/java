package a8_tries.try01.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * <h2>Problem: Group Words by Length</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of words, group them into a Map where each key is the word length and the value is the list of words having that length.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A Map<Integer, List<String>> mapping each length to its matching words.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: ["apple", "bat", "car", "banana"]<br>
 *       Expected: {3: ["bat", "car"], 5: ["apple"], 6: ["banana"]}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: ["hi", "to", "go"]<br>
 *       Expected: {2: ["hi", "to", "go"]}</li>
 * </ul>
 */
public class MapWordLength {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "car", "banana", "dog");
        Map<Integer, List<String>> result = groupByLength(words);
        System.out.println("Words: " + words);
        System.out.println("Grouped by length: " + result);
    }

    /**
     * Groups words by their string length.
     *
     * @param words list of words
     * @return map from length to list of words
     */
    public static Map<Integer, List<String>> groupByLength(List<String> words) {
        // TODO: Implement logic
        return Collections.emptyMap();
    }
}
