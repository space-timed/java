package a8_tries.try04.java8;

import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Stream of Random Numbers</h2>
 *
 * <p><b>Description:</b><br>
 * Generate a list of random integers within a specified range from origin (inclusive) to bound (exclusive).</p>
 *
 * <p><b>Expected Output:</b><br>
 * A list of randomly generated integers.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: count = 5, origin = 1, bound = 100<br>
 *       Expected: 5 random numbers between 1 and 99</li>
 * </ul>
 */
public class StreamRandomNumbers {

    public static void main(String[] args) {
        List<Integer> randoms = getRandomNumbers(5, 1, 100);
        System.out.println("5 Random numbers (1 to 100): " + randoms);
    }

    /**
     * Generates a list of random integers.
     *
     * @param count  number of random integers to produce
     * @param origin lower bound (inclusive)
     * @param bound  upper bound (exclusive)
     * @return list of random integers
     */
    public static List<Integer> getRandomNumbers(int count, int origin, int bound) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
