/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author fagun
 */

import java.util.Scanner;

// Class to manage book availability
class BookAvailability {
    private boolean[] bookAvailabilityArray;

    public BookAvailability(boolean[] bookAvailabilityArray) {
        this.bookAvailabilityArray = bookAvailabilityArray;
    }

    public boolean isAvailable(int index) {
        return bookAvailabilityArray[index];
    }

    public void borrowBook(int index) {
        bookAvailabilityArray[index] = false; // Mark the book as borrowed
    }
}

// Main class representing the library system
public class LibraryItem {
    
    private static String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
    private static BookAvailability availabilityChecker = new BookAvailability(new boolean[] {true, true, true, true}); // Initially all books are available

    public LibraryItem() {
    }

    public static String[] getBooks() {
        return books;
    }

    public static void setBooks(String[] books) {
        LibraryItem.books = books;
    }
    
    // Display the catalog of books
    public static void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");
        for (int i = 0; i < books.length; i++) {
            String availability = availabilityChecker.isAvailable(i) ? "Available" : "Unavailable";
            System.out.println((i + 1) + ". " + books[i] + " - " + availability);
        }
    }
    
    // Select a book to borrow
    public static void selectBook(Scanner sc) {
        System.out.print("\nEnter the number of the book you want to borrow: ");
        int choice = sc.nextInt() - 1; // Adjusting for 0-based indexing

        if (choice < 0 || choice >= books.length) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }

        if (availabilityChecker.isAvailable(choice)) {
            System.out.println("You selected: " + books[choice] + ". Enjoy your reading!");
            availabilityChecker.borrowBook(choice); // Mark the book as borrowed
        } else {
            System.out.println("Sorry, " + books[choice] + " is currently unavailable. Please select another book.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueBorrowing = true;

        while (continueBorrowing) {
            displayCatalog();
            selectBook(sc);

            System.out.print("\nWould you like to borrow another book? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            continueBorrowing = response.equals("yes");
        }

        System.out.println("Thank you for using the library!");
        sc.close();
    }
}