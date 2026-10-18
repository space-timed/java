package a8_tries.try04.string;

/**
 * <h2>Problem: Remove a Specific Character from a String</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program demonstrating how to remove a specific character from a string.
 * This can be done by removing the first occurrence of the character, or by removing
 * a character located at a specific index.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The modified string with the specific character removed.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1 (first occurrence):</b><br>
 *       Input: input = {@code "Java"}, target = {@code 'a'}<br>
 *       Expected: {@code "Jva"}</li>
 *   <li><b>Example 2 (at index):</b><br>
 *       Input: input = {@code "hello"}, index = {@code 1}<br>
 *       Expected: {@code "hllo"}</li>
 *   <li><b>Example 3 (at index 0):</b><br>
 *       Input: input = {@code "World"}, index = {@code 0}<br>
 *       Expected: {@code "orld"}</li>
 * </ul>
 */
public class RemoveCharacter {

    public static void main(String[] args) {
        String input = "Java";
        char target = 'a';
        int indexToRemove = 1;

        String resultFirstOccur = removeFirstOccurrence(input, target);
        String resultAtIndex = removeCharAt(input, indexToRemove);

        System.out.println("Original string: " + input);
        System.out.println("After removing first '" + target + "': " + resultFirstOccur);
        System.out.println("After removing char at index " + indexToRemove + ": " + resultAtIndex);
    }

    /**
     * Removes the first occurrence of the given character from the string.
     *
     * @param input  the source string
     * @param target the character to remove
     * @return string without the first occurrence of target
     */
    public static String removeFirstOccurrence(String input, char target) {
        // TODO: Implement logic to remove the first occurrence of a specific character
        return "";
    }

    /**
     * Removes the character at the specified index from the string.
     *
     * @param input the source string
     * @param index zero-based index of character to remove
     * @return string without the character at the given index
     */
    public static String removeCharAt(String input, int index) {
        // TODO: Implement logic to remove character at a specific index
        return "";
    }
}
