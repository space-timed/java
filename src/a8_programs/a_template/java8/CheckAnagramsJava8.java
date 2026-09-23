package a8_programs.a_template.java8;

/**
 * <h2>Problem: Anagram Program in Java 8</h2>
 *
 * <p><b>Description:</b><br>
 * Determine whether two given strings are anagrams of each other (contain the same characters with identical frequencies).</p>
 *
 * <p><b>Expected Output:</b><br>
 * A boolean: true if strings are anagrams, false otherwise.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: s1 = "listen", s2 = "silent"<br>
 *       Expected: true</li>
 *   <li><b>Example 2:</b><br>
 *       Input: s1 = "hello", s2 = "world"<br>
 *       Expected: false</li>
 * </ul>
 */
public class CheckAnagramsJava8 {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        boolean result = areAnagrams(s1, s2);
        System.out.println("'" + s1 + "' and '" + s2 + "' are anagrams? " + result);
    }

    /**
     * Checks if two strings are anagrams.
     *
     * @param s1 first string
     * @param s2 second string
     * @return true if anagrams, false otherwise
     */
    public static boolean areAnagrams(String s1, String s2) {
        // TODO: Implement logic
        return false;
    }
}
