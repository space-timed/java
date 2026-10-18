package a8_tries.try01.math;

/**
 * <h2>Problem: Check If a Number Is Prime</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to determine whether a given integer {@code n} is a prime number.
 * A prime number is a natural number greater than 1 that cannot be formed by multiplying
 * two smaller natural numbers. Optimize the check up to {@code sqrt(n)}.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A boolean: {@code true} if the number is prime, otherwise {@code false}.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code 17}<br>
 *       Expected: {@code true}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code 4}<br>
 *       Expected: {@code false}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code 1}<br>
 *       Expected: {@code false} (1 is neither prime nor composite)</li>
 *   <li><b>Example 4:</b><br>
 *       Input: {@code 2}<br>
 *       Expected: {@code true} (smallest and only even prime)</li>
 * </ul>
 */
public class CheckPrime {

    public static void main(String[] args) {
        int n = 17;

        boolean result = isPrime(n);
        System.out.println("Number: " + n);
        System.out.println("Is prime? " + result);
    }

    /**
     * Checks if the given number is prime.
     *
     * @param n the number to check
     * @return true if prime, false otherwise
     */
    public static boolean isPrime(int n) {
        // TODO: Implement prime checking logic checking divisors up to sqrt(n)
        return false;
    }
}
