package a8_tries.try03.java8;

import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Infinite Stream of Fibonacci Sequence</h2>
 *
 * <p><b>Description:</b><br>
 * Generate the Fibonacci sequence and extract the first n elements.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list of Fibonacci numbers.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: limit = 8<br>
 *       Expected: [0, 1, 1, 2, 3, 5, 8, 13]</li>
 * </ul>
 */
public class InfiniteFibonacciStream {

    public static void main(String[] args) {
        List<Long> fib = getFirstNFibonacci(8);
        System.out.println("First 8 Fibonacci numbers: " + fib);
    }

    /**
     * Generates Fibonacci sequence and collects first n elements.
     *
     * @param n count of elements to take
     * @return list of n Fibonacci numbers
     */
    public static List<Long> getFirstNFibonacci(int n) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
