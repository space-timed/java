package a8_tries.try02.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <h2>Problem: Convert Nested Map to List</h2>
 *
 * <p><b>Description:</b><br>
 * Flatten a nested map structure into a flat list of formatted entries.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A flat list of flattened representations or records.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {"Dept1": {"Alice": 100, "Bob": 200}}<br>
 *       Expected: ["Dept1: Alice=100", "Dept1: Bob=200"]</li>
 * </ul>
 */
public class ConvertNestedMapToList {

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> nestedMap = new HashMap<>();
        Map<String, Integer> dept1 = new HashMap<>();
        dept1.put("Alice", 100);
        dept1.put("Bob", 200);
        nestedMap.put("Engineering", dept1);

        List<String> flatList = flattenNestedMap(nestedMap);
        System.out.println("Flattened nested map: " + flatList);
    }

    /**
     * Flattens a nested map to a list of strings.
     *
     * @param map nested map
     * @return flattened list
     */
    public static List<String> flattenNestedMap(Map<String, Map<String, Integer>> map) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
