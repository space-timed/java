package a8_tries.try01.string;

/**
 * <h2>Problem: Longest Substring Without Repeating Characters</h2>
 *
 * <p><b>Description:</b><br>
 * Given a string, find the longest contiguous substring without duplicate (repeating) characters.
 * Provide methods to find both the longest substring itself and its length.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The longest substring with all unique characters, and its length.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "abcabcbb"}<br>
 *       Expected: {@code "abc"} (length: 3)</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "bbbbb"}<br>
 *       Expected: {@code "b"} (length: 1)</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "pwwkew"}<br>
 *       Expected: {@code "wke"} (length: 3)</li>
 *   <li><b>Example 4:</b><br>
 *       Input: {@code ""}<br>
 *       Expected: {@code ""} (length: 0)</li>
 * </ul>
 */
public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        String input = "abcabcbb";

        String longestSubstr = findLongestSubstring(input);
        int length = findLongestSubstringLength(input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Longest substring without repeating characters: \"" + longestSubstr + "\"");
        System.out.println("Length: " + length);
    }

    /**
     * Finds the longest contiguous substring containing only unique characters.
     *
     * @param input the input string
     * @return the longest unique substring
     */
    public static String findLongestSubstring(String input) {
        // TODO: Implement sliding window logic to find the substring
        return "";
    }

    /**
     * Finds the length of the longest substring without repeating characters.
     *
     * @param input the input string
     * @return length of the longest substring
     */
    public static int findLongestSubstringLength(String input) {
        // TODO: Implement sliding window logic to calculate the length
        return 0;
    }
}
