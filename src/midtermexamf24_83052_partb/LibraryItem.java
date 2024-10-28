/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author Atinder
 */
import java.util.Scanner;

public class LibraryItem {
    
    //1. Low Coupling: To achieve low coupling I made an interface to handle the book availability services;
    private BookService bookService;

    public LibraryItem(BookService bookService) {
        this.bookService = bookService;
    }

    public void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");
        String[] books = bookService.getBooks();
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    public void selectBook(Scanner sc) {
        System.out.print("\nEnter the number of the book you want to borrow: ");
        int choice = sc.nextInt() - 1; // Adjusting for 0-based indexing

        if (choice < 0 || choice >= bookService.getBooks().length) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }

        if (bookService.isAvailable(choice)) {
            System.out.println("You selected: " + bookService.getBooks()[choice] + ". Enjoy your reading!");
            bookService.setAvailability(choice, false); // Mark the book as borrowed
        } else {
            System.out.println("Sorry, " + bookService.getBooks()[choice] + " is currently unavailable. Please select another book.");
        }
    }

    public static void main(String[] args) {
        BookService bookService = new BookAvailability();
        LibraryItem libraryItem = new LibraryItem(bookService);
        Scanner sc = new Scanner(System.in);
        boolean continueBorrowing = true;

        while (continueBorrowing) {
            libraryItem.displayCatalog();
            libraryItem.selectBook(sc);

            System.out.print("\nWould you like to borrow another book? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            continueBorrowing = response.equals("yes");
        }

        System.out.println("Thank you for using the library!");
        sc.close();
    }
}
