package a8_programs.practice02.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h2>Problem: Create a Paginated Result</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of items, extract a sublist corresponding to a specific page number and page size.</p>
 *
 * <p><b>Expected Output:</b><br>
 * A sublist containing only items for the requested page.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [1..10], pageNumber = 2, pageSize = 3<br>
 *       Expected: [4, 5, 6]</li>
 *   <li><b>Example 2:</b><br>
 *       Input: [1..10], pageNumber = 1, pageSize = 4<br>
 *       Expected: [1, 2, 3, 4]</li>
 * </ul>
 */
public class PaginatedResult {

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int pageNumber = 2;
        int pageSize = 3;
        List<Integer> page = getPage(data, pageNumber, pageSize);
        System.out.println("All data: " + data);
        System.out.println("Page " + pageNumber + " (size " + pageSize + "): " + page);
    }

    /**
     * Retrieves a paginated slice of items.
     *
     * @param items      full list of items
     * @param pageNumber 1-based page index
     * @param pageSize   number of items per page
     * @param <T>        element type
     * @return slice of items for the given page
     */
    public static <T> List<T> getPage(List<T> items, int pageNumber, int pageSize) {
        // TODO: Implement logic
        return Collections.emptyList();
    }
}
