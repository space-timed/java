package a8_programs.attempt01.string;

/**
 * <h2>Problem: Convert Integer to Roman Numeral String</h2>
 *
 * <p><b>Description:</b><br>
 * Write a program to convert a given positive integer (typically from 1 to 3999)
 * into its corresponding Roman numeral string representation.
 * Standard Roman numerals are written using symbols:
 * I (1), V (5), X (10), L (50), C (100), D (500), M (1000), along with subtractive
 * forms such as IV (4), IX (9), XL (40), XC (90), CD (400), and CM (900).</p>
 *
 * <p><b>Expected Output:</b><br>
 * A string representing the Roman numeral form of the integer.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code 3}<br>
 *       Expected: {@code "III"}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code 58}<br>
 *       Expected: {@code "LVIII"} (50 = L, 8 = VIII)</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code 1994}<br>
 *       Expected: {@code "MCMXCIV"} (1000 = M, 900 = CM, 90 = XC, 4 = IV)</li>
 * </ul>
 */
public class IntegerToRoman {

    public static void main(String[] args) {
        int number = 1994;

        String roman = intToRoman(number);
        System.out.println("Integer: " + number);
        System.out.println("Roman numeral: " + roman);
    }

    /**
     * Converts a positive integer to Roman numeral string.
     *
     * @param num the integer value (1 - 3999)
     * @return Roman numeral representation
     */
    public static String intToRoman(int num) {
        // TODO: Implement integer to Roman numeral conversion logic
        return "";
    }
}
