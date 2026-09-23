package a8_programs.p01.math;

/**
 * <h2>Problem: Find Power of a Number Without Recursion (Binary / Bit Manipulation)</h2>
 *
 * <p><b>Description:</b><br>
 * Write an iterative method to calculate {@code base^exponent} without recursion using binary
 * exponentiation / bit manipulation (checking least significant bits of the exponent and squaring the base)
 * in O(log n) time.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A {@code double} representing {@code base^exponent}.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code base = 2}, {@code exponent = 8}<br>
 *       Expected: {@code 256.0}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code base = 3}, {@code exponent = 3}<br>
 *       Expected: {@code 27.0}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code base = 5}, {@code exponent = 0}<br>
 *       Expected: {@code 1.0}</li>
 * </ul>
 */
public class PowerWithoutRecursion {

    public static void main(String[] args) {
        double base = 2;
        int exponent = 8;

        double result = power(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
    }

    /**
     * Calculates base raised to exponent iteratively using binary exponentiation / bit manipulation.
     *
     * @param base     the base number
     * @param exponent the power to raise base to
     * @return base raised to exponent
     */
    public static double power(double base, int exponent) {
        // TODO: Implement iterative binary exponentiation (O(log n)) using bitwise shift
        return 0.0;
    }
}
