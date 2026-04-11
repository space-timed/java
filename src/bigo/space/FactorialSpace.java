package bigo.space;

/**
 * Factorial Space Complexity - O(n!)
 * This means the operation's memory usage grows factorially with the input size.
 * Example: Generating all permutations of a string recursively.
 */
public class FactorialSpace {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Factorial Space Complexity - O(n!)
     * Generating all permutations of a string recursively.
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
