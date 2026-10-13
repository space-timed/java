package a8_programs.practice01.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * <h2>Problem: Finding Maximum and Minimum in a List of Objects</h2>
 *
 * <p><b>Description:</b><br>
 * Given a list of objects, find the objects with the maximum and minimum values for a specific attribute.</p>
 *
 * <p><b>Expected Output:</b><br>
 * Optional containing the max and min objects.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: [Product("Phone", 800), Product("Laptop", 1500), Product("Mouse", 20)]<br>
 *       Expected: Max = Laptop (1500), Min = Mouse (20)</li>
 * </ul>
 */
public class MaxMinInListOfObjects {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Phone", 800),
            new Product("Laptop", 1500),
            new Product("Mouse", 20)
        );
        Optional<Product> max = findMostExpensive(products);
        Optional<Product> min = findCheapest(products);
        System.out.println("Most expensive: " + max.orElse(null));
        System.out.println("Cheapest:       " + min.orElse(null));
    }

    public static class Product {
        private final String name;
        private final double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() { return price; }
        @Override public String toString() { return name + " ($" + price + ")"; }
    }

    public static Optional<Product> findMostExpensive(List<Product> products) {
        // TODO: Implement logic
        return Optional.empty();
    }

    public static Optional<Product> findCheapest(List<Product> products) {
        // TODO: Implement logic
        return Optional.empty();
    }
}
