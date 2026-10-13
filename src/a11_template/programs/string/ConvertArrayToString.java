package a11_template.programs.string;

/**
 * <h2>Problem: Convert an Array to String in Java</h2>
 *
 * <p><b>Description:</b><br>
 * Write methods to convert an array (such as {@code String[]}, {@code int[]}, or {@code char[]})
 * into a single readable String representation using traditional Java methods, {@code StringBuilder},
 * or Java 8 Streams.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A formatted string representation of the elements in the array.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {@code String[] {"Java", "Python", "Go"}} with delimiter {@code ", "}<br>
 *       Expected: {@code "Java, Python, Go"}</li>
 *   <li><b>Example 2:</b><br>
 *       Input: {@code int[] {1, 2, 3, 4, 5}}<br>
 *       Expected: {@code "[1, 2, 3, 4, 5]"} or {@code "12345"}</li>
 *   <li><b>Example 3:</b><br>
 *       Input: {@code char[] {'H', 'e', 'l', 'l', 'o'}}<br>
 *       Expected: {@code "Hello"}</li>
 * </ul>
 */
public class ConvertArrayToString {

    public static void main(String[] args) {
        String[] strArray = {"Java", "Python", "Go"};
        int[] intArray = {1, 2, 3, 4, 5};

        String strResult = convertStringArrayToString(strArray, ", ");
        String intResult = convertIntArrayToString(intArray);

        System.out.println("String array converted: " + strResult);
        System.out.println("Int array converted:    " + intResult);
    }

    /**
     * Converts an array of strings into a single delimited string.
     *
     * @param array     array of string elements
     * @param delimiter delimiter to separate elements
     * @return single formatted string
     */
    public static String convertStringArrayToString(String[] array, String delimiter) {
        // TODO: Implement logic using String.join, Streams, or StringBuilder
        return "";
    }

    /**
     * Converts a primitive int array to a formatted string representation.
     *
     * @param array array of integers
     * @return string representation of the array
     */
    public static String convertIntArrayToString(int[] array) {
        // TODO: Implement logic using Arrays.toString or Streams
        return "";
    }
}
