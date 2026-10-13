package a8_programs.practice01.string;

/**
 * <h2>Problem: Count Number of Vowels Present in a String (Iterative)</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to count the total number of vowels ('a', 'e', 'i', 'o', 'u', case-insensitive)
 * present in an input string using an iterative approach (e.g., standard loop or enhanced for-loop).</p>
 *
 * <p><b>Expected Output:</b><br>
 * An integer representing the count of vowels in the string.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "David is a handsome guy"}<br>
 *       Expected: {@code 8} ('a', 'i', 'i', 'a', 'a', 'o', 'e', 'u')</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "HELLO World"}<br>
 *       Expected: {@code 3} ('E', 'O', 'o')</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "rhythm"}<br>
 *       Expected: {@code 0}</li>
 * </ul>
 */
public class CountVowelsIterative {

    public static void main(String[] args) {
        String input = "David is a handsome guy";

        int vowelCount = countVowels(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Vowel count (iterative): " + vowelCount);
    }

    /**
     * Counts vowels in the given string iteratively.
     *
     * @param input the string to inspect
     * @return total count of vowels
     */
    public static int countVowels(String input) {
        // TODO: Implement the iterative logic to count vowels
        return 0;
    }
}
