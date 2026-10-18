package a8_tries.try02.string;

/**
 * <h2>Problem: Reverse a String</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to reverse a given input string. The reversed string should contain
 * all characters of the original string in the opposite order.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A string representing the reversed version of the input string.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "David"}<br>
 *       Expected: {@code "divaD"}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "hello"}<br>
 *       Expected: {@code "olleh"}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "a"}<br>
 *       Expected: {@code "a"}</li>
 *   <li><b>Example 4:</b><br>
 *       Input: {@code ""}<br>
 *       Expected: {@code ""}</li>
 * </ul>
 */
public class ReverseString {

    public static void main(String[] args) {
        String input = "David";

        String reversed = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }

    /**
     * Reverses the given input string.
     *
     * @param input the string to reverse
     * @return the reversed string
     */
    public static String reverseString(String input) {
        // TODO: Implement the logic to reverse a string
        return "";
    }
}
