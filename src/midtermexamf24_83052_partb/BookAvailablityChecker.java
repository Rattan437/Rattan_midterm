/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author makkaarm
 */
// Encapsulation: The logic is encapsulated within the class.other classe libraryitem interact with this class through provided methods wihout showing the internal working.
// This class has a single responsibility ofSIngle Responsibility Principle: checking and updating the availability of books. It does not concern itself with how books are displayed or selected.
public class BookAvailablityChecker {
    
       // Array to hold the books' availability status
    private Book[] books;

    public BookAvailablityChecker(Book[] books) {
        this.books = books;
    }

    public boolean isAvailable(int bookIndex) {
        return books[bookIndex].isAvailable(); // Check availability using the Book class
    }

    public void markAsBorrowed(int bookIndex) {
        books[bookIndex].setAvailable(false); // Mark the book as unavailable
    }
}