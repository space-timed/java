package a8_programs.practice01.math;

import java.util.Arrays;
import java.util.List;

/**
 * <h2>Problem: Check If a List Contains Only Odd Numbers</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program that checks whether a given list of integers contains only odd numbers.
 * If any even number is encountered, the method should return {@code false}.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A boolean: {@code true} if every number in the list is odd, otherwise {@code false}.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code [1, 3, 5, 7, 9]}<br>
 *       Expected: {@code true}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code [1, 3, 4, 7, 9]}<br>
 *       Expected: {@code false} (4 is even)</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code [2, 4, 6]}<br>
 *       Expected: {@code false}</li>
 *   <li><b>Example 4:</b><br>
 *       Input: {@code []}<br>
 *       Expected: {@code true}</li>
 * </ul>
 */
public class CheckListContainsOnlyOdd {

    public static void main(String[] args) {
        List<Integer> oddList = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> mixedList = Arrays.asList(1, 3, 4, 7, 9);

        System.out.println(oddList + " contains only odd? " + containsOnlyOdd(oddList));
        System.out.println(mixedList + " contains only odd? " + containsOnlyOdd(mixedList));
    }

    /**
     * Checks if the list contains only odd numbers.
     *
     * @param numbers list of integers to verify
     * @return true if all numbers are odd, false if any number is even
     */
    public static boolean containsOnlyOdd(List<Integer> numbers) {
        // TODO: Implement iterative check or Java 8 Stream allMatch(n -> n % 2 != 0)
        return false;
    }
}
