package a11_template.programs.math;

/**
 * <h2>Problem: Find Power of a Number Using Recursion</h2>
 *
 * <p><b>Description:</b><br>
 * Write a recursive method to calculate {@code base} raised to the power {@code exponent}
 * ({@code base^exponent}) without using {@code Math.pow()}. Handle edge cases such as
 * exponent = 0, positive exponent, and negative exponent.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A {@code double} representing {@code base^exponent}.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code base = 2}, {@code exponent = 3}<br>
 *       Expected: {@code 8.0}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code base = 5}, {@code exponent = 0}<br>
 *       Expected: {@code 1.0}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code base = 2}, {@code exponent = -2}<br>
 *       Expected: {@code 0.25}</li>
 * </ul>
 */
public class PowerUsingRecursion {

    public static void main(String[] args) {
        double base = 2;
        int exponent = 10;

        double result = power(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
    }

    /**
     * Recursively calculates base raised to the power of exponent.
     *
     * @param base     the base number
     * @param exponent the power to raise base to
     * @return base raised to exponent
     */
    public static double power(double base, int exponent) {
        // TODO: Implement recursive exponentiation logic (e.g., base * power(base, exp - 1) or fast power)
        return 0.0;
    }
}
