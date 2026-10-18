package a8_programs.attempt01.math;

/**
 * <h2>Problem: Swap Two Numbers Using a Temporary Variable</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to swap the values of two numeric variables using an auxiliary
 * (temporary) variable.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The values of the two numbers exchanged.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code a = 10}, {@code b = 20}<br>
 *       Expected: {@code a = 20}, {@code b = 10}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code a = -5}, {@code b = 15}<br>
 *       Expected: {@code a = 15}, {@code b = -5}</li>
 * </ul>
 */
public class SwapWithTemp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);
        int[] swapped = swap(a, b);
        System.out.println("After swap:  a = " + swapped[0] + ", b = " + swapped[1]);
    }

    /**
     * Swaps two numbers using a temporary variable.
     *
     * @param a first integer
     * @param b second integer
     * @return array containing {b, a}
     */
    public static int[] swap(int a, int b) {
        // TODO: Implement swap logic using a third/temporary variable
        return new int[]{a, b};
    }
}
