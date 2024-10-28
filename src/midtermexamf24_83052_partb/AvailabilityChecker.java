/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author rohit
 */
public class AvailabilityChecker {
    private static boolean[] bookAvailability = {true, true, true, true};

    /**
     * Checks if a specific book is available.
     *
     * Principle: Encapsulation
     * The availability data is private and accessible only via methods.
     */
    public static boolean isBookAvailable(int index) {
        return index >= 0 && index < bookAvailability.length && bookAvailability[index];
    }

    /**
     * Marks a book as borrowed by setting its availability to false.
     *
     * Principle: Encapsulation
     * Only this class can update book availability, ensuring data consistency.
     */
    public static void borrowBook(int index) {
        if (isBookAvailable(index)) {
            bookAvailability[index] = false;
        }
    }

    /**
     * Marks a book as returned by setting its availability to true.
     *
     * Principle: Encapsulation
     * Controlled data updates reinforce data integrity.
     */
    public static void returnBook(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            bookAvailability[index] = true;
        }
    }
}
