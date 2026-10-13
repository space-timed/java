package a11_template.programs.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <h2>Problem: Convert a Map to a List of Entries</h2>
 *
 * <p><b>Description:</b><br>
 * Given a map, extract and convert all its key-value pairs into a list of Map entries.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A List containing all entry key-value pairs.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: {1: "One", 2: "Two"}<br>
 *       Expected: [1=One, 2=Two]</li>
 * </ul>
 */
public class ConvertMapToList {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        List<Map.Entry<Integer, String>> entries = convertToList(map);
        System.out.println("Map: " + map);
        System.out.println("List of entries: " + entries);
    }

    /**
     * Converts a map to a list of entries.
     *
     * @param map source map
     * @param <K> key type
     * @param <V> value type
     * @return list of map entries
     */
    public static <K, V> List<Map.Entry<K, V>> convertToList(Map<K, V> map) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
