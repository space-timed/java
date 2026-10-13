package a11_template.programs.array;

/**
 * <h2>Problem: Find the Missing Number in an Array (1 to N)</h2>
 *
 * <p><b>Description:</b><br>
 * Given an array containing distinct integers taken from the range {@code 1} to {@code n},
 * exactly one integer from the range is missing. Write a program to find that missing number
 * using mathematical sum formula {@code n * (n + 1) / 2} or XOR operation.</p>
 *
 * <p><b>Expected Output:</b><br>
 * The integer value representing the missing number.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code arr = [1, 2, 4, 5, 6]}, {@code n = 6}<br>
 *       Expected: {@code 3}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code arr = [2, 3, 1, 5]}, {@code n = 5}<br>
 *       Expected: {@code 4}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code arr = [1, 2, 3, 4]}, {@code n = 5}<br>
 *       Expected: {@code 5}</li>
 * </ul>
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;

        int missing = findMissingNumber(arr, n);
        System.out.println("Array: [1, 2, 4, 5, 6], Range 1 to " + n);
        System.out.println("Missing number: " + missing);
    }

    /**
     * Finds the missing number from an array of 1 to n.
     *
     * @param arr the array containing n-1 distinct integers in range 1 to n
     * @param n   the total count of numbers including the missing one
     * @return the missing number
     */
    public static int findMissingNumber(int[] arr, int n) {
        // TODO: Implement logic using sum formula n*(n+1)/2 or XOR
        return 0;
    }
}
