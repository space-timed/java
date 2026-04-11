package bigo.space;

/**
 * Exponential Space Complexity - O(2^n)
 * This means the operation's memory usage doubles with each additional input element.
 * Example: Recursive computation of Fibonacci numbers.
 */
public class ExponentialSpace {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Exponential Space Complexity - O(2^n)
     * Recursive computation of Fibonacci numbers.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
