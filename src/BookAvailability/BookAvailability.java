/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author saval
 */
public class BookAvailability {

  
    private boolean[] bookAvailability;

    public BookAvailability(int size) {
        this.bookAvailability = new boolean[size];
        for (int i = 0; i < size; i++) {
            this.bookAvailability[i] = true; // Initially, all books are available
        }
    }

    // Checks if a book is available
    public boolean isBookAvailable(int bookIndex) {
        return bookAvailability[bookIndex];
    }

    // Marks a book as borrowed
    public void borrowBook(int bookIndex) {
        bookAvailability[bookIndex] = false;
    }
}
