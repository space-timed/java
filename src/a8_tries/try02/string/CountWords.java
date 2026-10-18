package a8_tries.try02.string;

/**
 * <h2>Problem: Count the Number of Words in a String</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to count the total number of words in a given string.
 * Multiple consecutive spaces, leading spaces, and trailing spaces should be properly handled
 * and not counted as extra words.</p>
 *
 * <p><b>Expected Output:</b><br>
 * An integer representing the total count of words in the string.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "Java is an object oriented programming language"}<br>
 *       Expected: {@code 7}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "   Hello    World   "}<br>
 *       Expected: {@code 2}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "   "}<br>
 *       Expected: {@code 0}</li>
 *   <li><b>Example 4:</b><br>
 *       Input: {@code ""}<br>
 *       Expected: {@code 0}</li>
 * </ul>
 */
public class CountWords {

    public static void main(String[] args) {
        String input = "Java is an object oriented programming language";

        int wordCount = countWords(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Total words: " + wordCount);
    }

    /**
     * Counts the total number of words in the provided string.
     *
     * @param input the string to inspect
     * @return the number of words
     */
    public static int countWords(String input) {
        // TODO: Implement logic to count words handling irregular whitespace
        return 0;
    }
}
