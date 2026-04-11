package bigo.time;

/**
 * Factorial Time Complexity - O(n!)
 * This means the operation's time grows factorially with the input size.
 * Example: Generating all permutations of a string.
 */
public class FactorialTime {
    public static void main(String[] args) {
        // Example usage: generating permutations of the string "abc"
        generatePermutations("abc", "");
    }

    /**
     * Example of Factorial Time Complexity - O(n!)
     * Generating all permutations of a string.
     */
    public static void generatePermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, prefix + current);
        }
    }
}
