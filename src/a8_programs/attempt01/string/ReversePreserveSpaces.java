package a8_programs.attempt01.string;

/**
 * <h2>Problem: Reverse a String While Preserving Spaces Position</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to reverse a given string such that the relative positions of all
 * space characters are preserved, while the non-space characters are reversed.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A string with non-space characters in reversed order, but spaces remaining at their exact original indices.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code "I Am Not String"}<br>
 *       Expected: {@code "g ni rtS toNmAI"}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code "internship at geeks for geeks"}<br>
 *       Expected: {@code "skeegrofsk ee gtak eip hs nretni"}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code "a b c"}<br>
 *       Expected: {@code "c b a"}</li>
 *   <li><b>Example 4:</b><br>
 *       Input: {@code "hello"}<br>
 *       Expected: {@code "olleh"}</li>
 * </ul>
 */
public class ReversePreserveSpaces {

    public static void main(String[] args) {
        String input = "I Am Not String";

        String result = reversePreservingSpaces(input);
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Reversed: \"" + result + "\"");
    }

    /**
     * Reverses the non-space characters while keeping spaces at their original positions.
     *
     * @param input the input string
     * @return the transformed string
     */
    public static String reversePreservingSpaces(String input) {
        // TODO: Implement two-pointer or array-based logic to reverse while preserving space positions
        return "";
    }
}
