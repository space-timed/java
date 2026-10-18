package a8_tries.try01.string;

/**
 * <h2>Problem: Count Number of Vowels Present in a String (Recursive)</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to count the total number of vowels ('a', 'e', 'i', 'o', 'u', case-insensitive)
 * in an input string using recursion instead of iterative loops.</p>
 *
 * <p><b>Expected Output:</b><br>
 * An integer representing the count of vowels in the string.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "David is a handsome guy"}<br>
 *       Expected: {@code 8}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "Recursion"}<br>
 *       Expected: {@code 4} ('e', 'u', 'i', 'o')</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "xyz"}<br>
 *       Expected: {@code 0}</li>
 *   <li><b>Example 4:</b><br>
 *       Input: {@code ""}<br>
 *       Expected: {@code 0}</li>
 * </ul>
 */
public class CountVowelsRecursive {

    public static void main(String[] args) {
        String input = "David is a handsome guy";

        int vowelCount = countVowels(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Vowel count (recursive): " + vowelCount);
    }

    /**
     * Counts vowels in the given string recursively.
     *
     * @param input the string to inspect
     * @return total count of vowels
     */
    public static int countVowels(String input) {
        // TODO: Implement the recursive logic to count vowels
        return 0;
    }
}
