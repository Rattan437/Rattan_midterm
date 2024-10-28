/**
 * This class is a basic library system allowing users to view and borrow books.
 * Each book has an availability status that updates once borrowed.
 * 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermexamf24_83052_partb;

import java.util.Scanner;

/**
 * LibraryItem class - simulates a library system with basic book-borrowing functionality.
 * Each book in the list can either be available or checked out.
 *
 * @author Aatif Banday
 */
public class LibraryItem {
    
    private static String[] bookTitles = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
    private static boolean[] isAvailable = {true, true, true, true}; // True means the book is available

    public LibraryItem() {
        // Constructor - not currently used
    }

    // Retrieve the list of book titles
    public static String[] getBookTitles() {
        return bookTitles;
    }

    // Set the list of book titles
    public static void setBookTitles(String[] bookTitles) {
        LibraryItem.bookTitles = bookTitles;
    }

    // Retrieve book availability status
    public static boolean[] getIsAvailable() {
        return isAvailable;
    }

    // Set book availability status
    public static void setIsAvailable(boolean[] isAvailable) {
        LibraryItem.isAvailable = isAvailable;
    }
    
    // Display the catalog of books, including availability
    public static void showCatalog() {
        System.out.println("Welcome! Here’s our book collection:");
        for (int i = 0; i < bookTitles.length; i++) {
            // Adding "(Unavailable)" if the book is borrowed
            String availability = isAvailable[i] ? "Available" : "Unavailable";
            System.out.println((i + 1) + ". " + bookTitles[i] + " - " + availability);
        }
    }
    
    // Allow the user to select a book to borrow
    public static void chooseBook(Scanner scanner) {
        System.out.print("\nPlease enter the number of the book you’d like to borrow: ");
        int choice = scanner.nextInt() - 1; // Adjusting for 0-based index

        if (choice < 0 || choice >= bookTitles.length) {
            System.out.println("Oops! That’s not a valid selection. Try again.");
            return;
        }

        if (isAvailable[choice]) {
            System.out.println("You chose: " + bookTitles[choice] + ". Enjoy your book!");
            isAvailable[choice] = false; // Mark the book as borrowed
        } else {
            System.out.println("Sorry, " + bookTitles[choice] + " is currently borrowed. Try another one.");
        }
    }
    
    // Main program loop for borrowing books
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepBorrowing = true;

        while (keepBorrowing) {
            showCatalog();
            chooseBook(scanner);

            System.out.print("\nDo you want to borrow another book? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            keepBorrowing = response.equals("yes");
        }

        System.out.println("Thanks for visiting our library!");
        scanner.close();
    }
}
