package a8_programs.practice02.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * <h2>Problem: Grouping By with Downstream Collector</h2>
 *
 * <p><b>Description:</b><br>
 * Group a collection of items by a key and compute an aggregate summary (such as counting occurrences) for each group.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A Map where each group has an aggregated value computed for that group.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: ["apple", "banana", "apricot", "cherry"], group by first char and count<br>
 *       Expected: {'a': 2, 'b': 1, 'c': 1}</li>
 * </ul>
 */
public class GroupingByDownstreamCollector {

    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apricot", "cherry");
        Map<Character, Long> counts = countByFirstChar(items);
        System.out.println("Items: " + items);
        System.out.println("Counts by first char: " + counts);
    }

    /**
     * Groups words by first character and counts occurrences.
     *
     * @param words list of words
     * @return map from first character to count
     */
    public static Map<Character, Long> countByFirstChar(List<String> words) {
        // TODO: Implement logic
        return Collections.emptyMap();
    }
}
