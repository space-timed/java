package a8_tries.try03.math;

/**
 * <h2>Problem: Swap Two Numbers Without Using a Third Variable</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to swap the values of two integer variables without declaring
 * a third (temporary) variable, using arithmetic operations (addition/subtraction)
 * or bitwise XOR operations.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The values of the two numbers exchanged.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code a = 15}, {@code b = 25}<br>
 *       Expected: {@code a = 25}, {@code b = 15}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code a = 100}, {@code b = -50}<br>
 *       Expected: {@code a = -50}, {@code b = 100}</li>
 * </ul>
 */
public class SwapNumbersWithoutTemp {

    public static void main(String[] args) {
        int a = 15;
        int b = 25;

        System.out.println("Before swap: a = " + a + ", b = " + b);
        int[] swapped = swapWithoutTemp(a, b);
        System.out.println("After swap:  a = " + swapped[0] + ", b = " + swapped[1]);
    }

    /**
     * Swaps two numbers without using a third variable.
     *
     * @param a first integer
     * @param b second integer
     * @return array containing {b, a}
     */
    public static int[] swapWithoutTemp(int a, int b) {
        // TODO: Implement arithmetic (a = a + b, b = a - b, a = a - b) or bitwise XOR swap logic
        return new int[]{a, b};
    }
}
