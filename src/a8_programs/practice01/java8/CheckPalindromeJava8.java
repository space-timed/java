package a8_programs.practice01.java8;

/**
 * <h2>Problem: Palindrome Program in Java 8</h2>
 *
 * <p><b>Description:</b><br>
 * Determine whether a given string reads the same forwards and backwards.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A boolean: true if palindrome, false otherwise.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: "radar"<br>
 *       Expected: true</li>
 *   <li><b>Example 2:</b><br>
 *       Input: "java"<br>
 *       Expected: false</li>
 * </ul>
 */
public class CheckPalindromeJava8 {

    public static void main(String[] args) {
        String s = "radar";
        boolean result = isPalindrome(s);
        System.out.println("'" + s + "' is palindrome? " + result);
    }

    /**
     * Checks if string is palindrome.
     *
     * @param s input string
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        // TODO: Implement logic
        return false;
    }
}
