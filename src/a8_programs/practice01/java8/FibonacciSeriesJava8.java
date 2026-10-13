package a8_programs.practice01.java8;

import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Fibonacci Series in Java 8</h2>
 *
 * <p><b>Description:</b><br>
 * Generate the first n numbers of the Fibonacci sequence starting with 0 and 1.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list containing the first n Fibonacci numbers.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: n = 10<br>
 *       Expected: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]</li>
 * </ul>
 */
public class FibonacciSeriesJava8 {

    public static void main(String[] args) {
        int count = 10;
        List<Integer> fib = generateFibonacci(count);
        System.out.println("First " + count + " Fibonacci numbers: " + fib);
    }

    /**
     * Generates Fibonacci series.
     *
     * @param count count of numbers to generate
     * @return list of Fibonacci numbers
     */
    public static List<Integer> generateFibonacci(int count) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
