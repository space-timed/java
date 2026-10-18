package a8_tries.try01.java8;

/**
 * <h2>Problem: Sum Comma Separated Numbers in a String</h2>
 *
 * <p><b>Description:</b><br>
 * Calculate the total sum of all integer values present in a comma-separated string.</p>
 *
 * <p><b>Expected Output:</b><br>
 * An integer representing the sum of the numbers.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: "10, 20, 30, 40, 50"<br>
 *       Expected: 150</li>
 *   <li><b>Example 2:</b><br>
 *       Input: "1,2,3"<br>
 *       Expected: 6</li>
 * </ul>
 */
public class SumCommaSeparatedNumbers {

    public static void main(String[] args) {
        String csv = "10, 20, 30, 40, 50";
        int total = sumCommaSeparated(csv);
        System.out.println("CSV string: \"" + csv + "\"");
        System.out.println("Sum: " + total);
    }

    /**
     * Sums numbers from a comma-separated string.
     *
     * @param csv comma-separated number string
     * @return sum of all numbers
     */
    public static int sumCommaSeparated(String csv) {
        // TODO: Implement logic
        return 0;
    }
}
