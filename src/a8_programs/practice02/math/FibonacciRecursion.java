package a8_programs.practice02.math;

/**
 * <h2>Problem: Fibonacci Sequence and Sum Using Recursion</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to find the n-th Fibonacci number and the sum of the first n terms
 * in the Fibonacci sequence using recursion.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The n-th Fibonacci value and the cumulative sum of the sequence up to n.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code n = 6}<br>
 *       Expected: 6th Fibonacci number = {@code 8}, Sum of first 6 terms = {@code 12} (0 + 1 + 1 + 2 + 3 + 5)</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code n = 0}<br>
 *       Expected: {@code 0}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code n = 1}<br>
 *       Expected: {@code 1}</li>
 * </ul>
 */
public class FibonacciRecursion {

    public static void main(String[] args) {
        int n = 6;

        int nthTerm = fibonacci(n);
        int sum = fibonacciSum(n);

        System.out.println("Fibonacci term at index " + n + ": " + nthTerm);
        System.out.println("Sum of first " + n + " Fibonacci terms: " + sum);
    }

    /**
     * Finds the n-th Fibonacci number recursively.
     *
     * @param n the index (0-based)
     * @return the n-th Fibonacci number
     */
    public static int fibonacci(int n) {
        // TODO: Implement recursive Fibonacci calculation: F(n) = F(n-1) + F(n-2)
        return 0;
    }

    /**
     * Calculates the sum of the first n Fibonacci numbers recursively.
     *
     * @param n the number of terms
     * @return the cumulative sum
     */
    public static int fibonacciSum(int n) {
        // TODO: Implement recursive logic to find sum of Fibonacci sequence
        return 0;
    }
}
