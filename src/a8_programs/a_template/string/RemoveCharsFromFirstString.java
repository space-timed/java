package a8_programs.a_template.string;

/**
 * <h2>Problem: Remove Characters from First String Present in Second String</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program that accepts two strings and removes all characters from the first string
 * that are present in the second string.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A new string containing only characters from the first string that do not exist in the second string.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: first = {@code "india is my country"}, second = {@code "in"}<br>
 *       Expected: {@code "da s my coutry"}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: first = {@code "the quick brown fox"}, second = {@code "queen"}<br>
 *       Expected: {@code "th ick brow fox"}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: first = {@code "abcdef"}, second = {@code "xyz"}<br>
 *       Expected: {@code "abcdef"}</li>
 * </ul>
 */
public class RemoveCharsFromFirstString {

    public static void main(String[] args) {
        String first = "india is my country";
        String second = "in";

        String result = removeCharsPresentInSecond(first, second);
        System.out.println("First string:  \"" + first + "\"");
        System.out.println("Second string: \"" + second + "\"");
        System.out.println("Result:        \"" + result + "\"");
    }

    /**
     * Removes characters from the first string that are present in the second string.
     *
     * @param first  the original string
     * @param second the string whose characters should be stripped
     * @return resulting string
     */
    public static String removeCharsPresentInSecond(String first, String second) {
        // TODO: Implement logic using lookup set, regex, or string manipulation
        return "";
    }
}
