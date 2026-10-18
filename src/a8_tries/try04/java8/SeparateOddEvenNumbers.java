package a8_tries.try04.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * <h2>Problem: Separate Odd and Even Numbers</h2>
 *
 * <p><b>Description:</b><br>
 * Partition a list of integers into two groups: even numbers and odd numbers.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A Map<Boolean, List<Integer>> where true maps to evens and false maps to odds.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [1, 2, 3, 4, 5, 6]<br>
 *       Expected: {false: [1, 3, 5], true: [2, 4, 6]}</li>
 * </ul>
 */
public class SeparateOddEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Map<Boolean, List<Integer>> partitioned = partitionOddEven(numbers);
        System.out.println("Numbers: " + numbers);
        System.out.println("Evens (true): " + partitioned.get(true));
        System.out.println("Odds (false): " + partitioned.get(false));
    }

    /**
     * Partitions numbers into evens and odds.
     *
     * @param numbers list of integers
     * @return map where true -> even numbers, false -> odd numbers
     */
    public static Map<Boolean, List<Integer>> partitionOddEven(List<Integer> numbers) {
        // TODO: Implement logic
        return Collections.emptyMap();
    }
}
