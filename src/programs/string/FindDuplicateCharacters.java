package programs.string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        // Example input
        String input = "programming";

        // Call the method and print the result
        findDuplicateCharacters(input);
    }

    public static void findDuplicateCharacters(String input) {
        // Create a map to store the count of each character
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over the string and populate the map
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
