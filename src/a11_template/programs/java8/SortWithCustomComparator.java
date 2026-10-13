package a11_template.programs.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Sort Elements by Custom Criteria</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of strings, sort them based on custom criteria (e.g. by string length in ascending order).</p>
 *
 * <p><b>Expected Output:</b><br>
 * A sorted list according to the specified criteria.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: ["banana", "apple", "kiwi", "pear"], sort by length<br>
 *       Expected: ["kiwi", "pear", "apple", "banana"]</li>
 *   <li><b>Example 2:</b><br>
 *       Input: ["cat", "elephant", "dog"], sort by length<br>
 *       Expected: ["cat", "dog", "elephant"]</li>
 * </ul>
 */
public class SortWithCustomComparator {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "kiwi", "pear");
        List<String> sorted = sortByLength(words);
        System.out.println("Original: " + words);
        System.out.println("Sorted by length: " + sorted);
    }

    /**
     * Sorts strings by length.
     *
     * @param words list of strings
     * @return sorted list
     */
    public static List<String> sortByLength(List<String> words) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
