package a8_tries.try03.string;

/**
 * <h2>Problem: Check If Two Strings Are Anagrams</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to determine if two given strings are anagrams of each other.
 * Two strings are called anagrams if they contain the exact same characters with the exact
 * same frequencies, but possibly in a different order (ignoring casing and spaces if applicable).</p>
 *
 * <p><b>Expected Output:</b><br>
 * A boolean: {@code true} if the two strings are anagrams, otherwise {@code false}.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: str1 = {@code "listen"}, str2 = {@code "silent"}<br>
 *       Expected: {@code true}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: str1 = {@code "triangle"}, str2 = {@code "integral"}<br>
 *       Expected: {@code true}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: str1 = {@code "apple"}, str2 = {@code "pale"}<br>
 *       Expected: {@code false}</li>
 * </ul>
 */
public class CheckAnagrams {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = areAnagrams(str1, str2);
        System.out.println("String 1: \"" + str1 + "\"");
        System.out.println("String 2: \"" + str2 + "\"");
        System.out.println("Are anagrams: " + result);
    }

    /**
     * Checks if two strings are anagrams.
     *
     * @param str1 first string
     * @param str2 second string
     * @return true if both strings are anagrams, false otherwise
     */
    public static boolean areAnagrams(String str1, String str2) {
        // TODO: Implement logic to check if two strings are anagrams (e.g., sorting or frequency count)
        return false;
    }
}
