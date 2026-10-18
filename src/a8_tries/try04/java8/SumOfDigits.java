package a8_tries.try04.java8;

/**
 * <h2>Problem: Sum of All Digits of a Number</h2>
 *
 * <p><b>Description:</b><br>
 * Compute the sum of all individual digits of a given integer.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The integer sum of the digits.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: 12345<br>
 *       Expected: 15 (1 + 2 + 3 + 4 + 5)</li>
 *   <li><b>Example 2:</b><br>
 *       Input: 987<br>
 *       Expected: 24 (9 + 8 + 7)</li>
 * </ul>
 */
public class SumOfDigits {

    public static void main(String[] args) {
        int number = 12345;
        int sum = sumDigits(number);
        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
    }

    /**
     * Computes sum of digits of a number.
     *
     * @param number input integer
     * @return sum of digits
     */
    public static int sumDigits(int number) {
        // TODO: Implement logic
        return 0;
    }
}
