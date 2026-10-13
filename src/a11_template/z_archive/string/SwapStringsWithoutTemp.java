package a11_template.z_archive.string;

public class SwapStringsWithoutTemp {
    public static void main(String[] args) {
        // Example input
        String str1 = "hello";
        String str2 = "world";

        // Call the method and print the result
        String[] swapped = swapStringsWithoutTemp(str1, str2);
        System.out.println("Swapped strings: " + swapped[0] + ", " + swapped[1]);
    }

    public static String[] swapStringsWithoutTemp(String str1, String str2) {
        // TODO: Implement the logic to swap strings without using a temp variable
        return new String[]{str1, str2};
    }
}
