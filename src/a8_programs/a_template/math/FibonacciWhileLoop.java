package a8_programs.a_template.math;

/**
 * <h2>Problem: Print Fibonacci Sequence Using a While Loop</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to print the first {@code n} terms of the Fibonacci sequence using a while loop.
 * The Fibonacci sequence begins with 0 and 1, and each subsequent number is the sum
 * of the previous two (0, 1, 1, 2, 3, 5, 8, 13, ...).</p>
 *
 * <p><b>Expected Output:</b><br>
 * The sequence of numbers printed sequentially.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code count = 10}<br>
 *       Expected: {@code 0, 1, 1, 2, 3, 5, 8, 13, 21, 34}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code count = 5}<br>
 *       Expected: {@code 0, 1, 1, 2, 3}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code count = 1}<br>
 *       Expected: {@code 0}</li>
 * </ul>
 */
public class FibonacciWhileLoop {

    public static void main(String[] args) {
        int count = 10;

        System.out.println("First " + count + " Fibonacci numbers:");
        printFibonacci(count);
    }

    /**
     * Prints the first n terms of the Fibonacci sequence using a while loop.
     *
     * @param count the number of terms to print
     */
    public static void printFibonacci(int count) {
        // TODO: Implement while-loop logic to print Fibonacci numbers
    }
}
