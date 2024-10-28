/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author causticsoda07
 */
public class BookAvailability {

    private boolean[] bookAvailability;

    // Constructor to initialize the availability array
    public BookAvailability(boolean[] bookAvailability) {
        this.bookAvailability = bookAvailability;
    }

    // Method to check if a book is available
    public boolean isAvailable(int index) {
        if (index < 0 || index >= bookAvailability.length) {
            return false; // Invalid index
        }
        return bookAvailability[index];
    }

    // Method to mark a book as borrowed
    public void borrowBook(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            bookAvailability[index] = false; // Mark as unavailable
        }
    }
}