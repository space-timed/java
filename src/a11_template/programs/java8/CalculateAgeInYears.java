package a11_template.programs.java8;

import java.time.LocalDate;

/**
 * <h2>Problem: Age of Person in Years</h2>
 *
 * <p><b>Description:</b><br>
 * Given a person's birth date and a reference date, calculate their completed age in years.</p>
 *
 * <p><b>Expected Output:</b><br>
 * An integer representing the completed years of age.</p>
 *
 * <p><b>Examples:</b></p>
 * <ul>
 *   <li><b>Example 1:</b><br>
 *       Input: birthDate = 1995-05-15, currentDate = 2026-09-23<br>
 *       Expected: 31</li>
 * </ul>
 */
public class CalculateAgeInYears {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1995, 5, 15);
        LocalDate currentDate = LocalDate.now();
        int age = calculateAge(birthDate, currentDate);
        System.out.println("Birth date: " + birthDate);
        System.out.println("Current date: " + currentDate);
        System.out.println("Age in years: " + age);
    }

    /**
     * Calculates age in years.
     *
     * @param birthDate   date of birth
     * @param currentDate current reference date
     * @return age in completed years
     */
    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        // TODO: Implement logic
        return 0;
    }
}
