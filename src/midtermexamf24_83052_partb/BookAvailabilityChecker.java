/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author av506
 */
public class BookAvailabilityChecker {
 private static boolean[] bookAvailability = LibraryItem.getBookAvailability();

    // This method checks if a book is available based on its index
    public boolean isBookAvailable(int index) {
        if (index < 0 || index >= bookAvailability.length) {
            return false; // Index out of bounds
        }
        return bookAvailability[index];
    }

    // Mark a book as borrowed
    public void borrowBook(int index) {
        if (isBookAvailable(index)) {
            bookAvailability[index] = false; // Mark the book as borrowed
        }
    }
}
