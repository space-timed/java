package a8_tries.try01.string;

/**
 * <h2>Problem: Check Whether a String is a Palindrome</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to check whether a given string is a palindrome.
 * A string is considered a palindrome if it reads identically forwards and backwards.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A boolean value: {@code true} if the string is a palindrome, otherwise {@code false}.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "malayalam"}<br>
 *       Expected: {@code true}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "racecar"}<br>
 *       Expected: {@code true}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "hello"}<br>
 *       Expected: {@code false}</li>
 *   <li><b>Example 4:</b><br>
 *       Input: {@code "a"}<br>
 *       Expected: {@code true}</li>
 * </ul>
 */
public class CheckPalindrome {

    public static void main(String[] args) {
        String input = "malayalam";

        boolean result = isPalindrome(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Is palindrome: " + result);
    }

    /**
     * Checks if the given string is a palindrome.
     *
     * @param input the string to verify
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        // TODO: Implement logic to check if a string is a palindrome
        return false;
    }
}
