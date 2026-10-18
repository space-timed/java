package a8_tries.try04.string;

import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Print All Permutations of a String</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to generate and return all possible permutations (rearrangements)
 * of characters in a given string. For a string of length {@code n} with unique characters,
 * there are {@code n!} permutations.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list of strings containing all unique permutations of the input string.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "abc"}<br>
 *       Expected: {@code ["abc", "acb", "bac", "bca", "cab", "cba"]}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "ab"}<br>
 *       Expected: {@code ["ab", "ba"]}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "a"}<br>
 *       Expected: {@code ["a"]}</li>
 * </ul>
 */
public class AllPermutations {

    public static void main(String[] args) {
        String input = "abc";

        List<String> permutations = findPermutations(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Total permutations: " + permutations.size());
        System.out.println("Permutations: " + permutations);
    }

    /**
     * Generates all permutations of the given string.
     *
     * @param input the string to permute
     * @return list of all permutations
     */
    public static List<String> findPermutations(String input) {
        // TODO: Implement recursive backtracking or iterative logic to generate all permutations
        return Collections.emptyList();
    }
}
