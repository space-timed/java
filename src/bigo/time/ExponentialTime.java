package bigo.time;

/**
 * Exponential Time Complexity - O(2^n)
 * This means the operation's time doubles with each additional input element.
 * Example: Solving the Tower of Hanoi problem.
 */
public class ExponentialTime {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Exponential Time Complexity - O(2^n)
     * Solving the Tower of Hanoi problem.
     */
    public static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }
}
