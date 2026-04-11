package bigo.space;

/**
 * Constant Space Complexity - O(1)
 * This means the operation uses the same amount of memory regardless of the input size.
 * Example: Swapping two variables.
 */
public class ConstantSpace {
    public static void main(String[] args) {
        // Empty main method
    }

    /**
     * Example of Constant Space Complexity - O(1)
     * Swapping two variables.
     */
    public static void swapVariables() {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
