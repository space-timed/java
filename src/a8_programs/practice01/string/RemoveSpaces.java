package a8_programs.practice01.string;

/**
 * <h2>Problem: Remove Leading and Trailing Spaces from a String</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to remove all leading and trailing whitespace characters from a given string
 * without removing or altering whitespace located between words within the string.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A trimmed string with all leading and trailing spaces stripped away.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "   Hello World!   "}<br>
 *       Expected: {@code "Hello World!"}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "  Java  "}<br>
 *       Expected: {@code "Java"}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "NoSpaces"}<br>
 *       Expected: {@code "NoSpaces"}</li>
 *   <li><b>Example 4:</b><br>
 *       Input: {@code "      "}<br>
 *       Expected: {@code ""}</li>
 * </ul>
 */
public class RemoveSpaces {

    public static void main(String[] args) {
        String input = "   Hello World!   ";

        String result = removeLeadingAndTrailingSpaces(input);
        System.out.println("Original: [" + input + "]");
        System.out.println("Trimmed:  [" + result + "]");
    }

    /**
     * Removes leading and trailing whitespace from the given string.
     *
     * @param input the original string
     * @return string without leading or trailing spaces
     */
    public static String removeLeadingAndTrailingSpaces(String input) {
        // TODO: Implement logic to remove leading and trailing spaces (e.g. without or with built-in methods)
        return "";
    }
}
