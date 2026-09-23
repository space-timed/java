package a8_programs.a_template.string;

/**
 * <h2>Problem: Remove All Occurrences of a Character</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program that takes a string and a target character, and removes every occurrence
 * of that character from the string, returning the resulting string.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A new string containing all characters from the original string except the specified character.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: input = {@code "banana"}, target = {@code 'a'}<br>
 *       Expected: {@code "bnn"}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: input = {@code "Hello World"}, target = {@code 'l'}<br>
 *       Expected: {@code "Heo Word"}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: input = {@code "Java"}, target = {@code 'x'}<br>
 *       Expected: {@code "Java"}</li>
 *   <li><b>Example 4:</b><br>
 *       Input: input = {@code "aaaa"}, target = {@code 'a'}<br>
 *       Expected: {@code ""}</li>
 * </ul>
 */
public class RemoveAllOccurrencesOfCharacter {

    public static void main(String[] args) {
        String input = "banana";
        char target = 'a';

        String result = removeAllOccurrences(input, target);
        System.out.println("Original string: " + input);
        System.out.println("Target character: '" + target + "'");
        System.out.println("Resulting string: " + result);
    }

    /**
     * Removes all occurrences of the specified character from the input string.
     *
     * @param input  the source string
     * @param target the character to be removed
     * @return the string with all instances of target removed
     */
    public static String removeAllOccurrences(String input, char target) {
        // TODO: Implement logic to remove all occurrences of the given character
        return "";
    }
}
