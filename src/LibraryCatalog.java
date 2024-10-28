package midtermexamf24_83052_partb;
import java.util.Scanner;
import midtermexamf24_83052_partb.BookAvailability;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saval
 */
public class LibraryCatalog {
    private String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
    private BookAvailability bookAvailability;

    // Constructor initializes book availability
    public LibraryCatalog() {
        this.bookAvailability = new BookAvailability(books.length); // Initializes book availability for each book
    }

    public void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    public void selectBook(Scanner sc) {
        System.out.print("\nEnter the number of the book you want to borrow: ");
        int choice = sc.nextInt() - 1; // Adjusting for 0-based indexing

        if (choice < 0 || choice >= books.length) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }

        if (bookAvailability.isBookAvailable(choice)) {
            System.out.println("You selected: " + books[choice] + ". Enjoy your reading!");
            bookAvailability.borrowBook(choice); // Mark the book as borrowed
        } else {
            System.out.println("Sorry, " + books[choice] + " is currently unavailable. Please select another book.");
        }
    }
}
