package a8_programs.attempt02.math;

/**
 * <h2>Problem: Find the Factorial of an Integer</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to compute the factorial of a non-negative integer {@code n}.
 * The factorial of {@code n} (denoted as {@code n!}) is the product of all positive integers
 * less than or equal to {@code n}, where {@code 0! = 1}.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A {@code long} value representing the factorial of the given integer.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code 5}<br>
 *       Expected: {@code 120} (5 * 4 * 3 * 2 * 1)</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code 0}<br>
 *       Expected: {@code 1}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code 7}<br>
 *       Expected: {@code 5040}</li>
 * </ul>
 */
public class Factorial {

    public static void main(String[] args) {
        int n = 5;

        long result = factorial(n);
        System.out.println("Number: " + n);
        System.out.println("Factorial of " + n + " = " + result);
    }

    /**
     * Calculates the factorial of an integer.
     *
     * @param n a non-negative integer
     * @return the factorial value
     */
    public static long factorial(int n) {
        // TODO: Implement iterative or recursive factorial computation
        return 0L;
    }
}
