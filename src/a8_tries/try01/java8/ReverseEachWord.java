package a8_tries.try01.java8;

/**
 * <h2>Problem: Reverse Each Word of a String</h2>
 *
 * <p><b>Description:</b><br>
 * Given a sentence, reverse each individual word while preserving the original word order.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A string where each word is reversed.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: "Java Concept Of The Day"<br>
 *       Expected: "avaJ tpecnoC fO ehT yaD"</li>
 *   <li><b>Example 2:</b><br>
 *       Input: "Hello World"<br>
 *       Expected: "olleH dlroW"</li>
 * </ul>
 */
public class ReverseEachWord {

    public static void main(String[] args) {
        String sentence = "Java Concept Of The Day";
        String reversed = reverseEachWord(sentence);
        System.out.println("Original: \"" + sentence + "\"");
        System.out.println("Reversed: \"" + reversed + "\"");
    }

    /**
     * Reverses each word in a sentence.
     *
     * @param sentence input sentence
     * @return sentence with each word reversed
     */
    public static String reverseEachWord(String sentence) {
        // TODO: Implement logic
        return "";
    }
}
