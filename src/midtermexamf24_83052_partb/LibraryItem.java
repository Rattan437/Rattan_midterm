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

public class LibraryItem {
    
    private static String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
    
    public LibraryItem() {
    }
    
    
    public static String[] getBooks() {
        return books;
    }

    public static void setBooks(String[] books) {
        LibraryItem.books = books;
    }

    
    public static void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    
    public static void selectBook(Scanner sc) {
        System.out.print("\nEnter the number of the book you want to borrow: ");
        int choice = sc.nextInt() - 1; // Adjusting for 0-based indexing

        if (choice < 0 || choice >= books.length) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }
        
        /**
        *
        * @author sangh
        * I moved the methods that check and set book availability into a new class called Availability.
        * This is an example of increasing cohesion because methods in a class should be closely related.
        */
        Availability bookAvailability = new Availability();
              
          
        if (bookAvailability.getBookAvailability()[choice]) {
            System.out.println("You selected: " + books[choice] + ". Enjoy your reading!");
            bookAvailability.getBookAvailability()[choice] = false; // Mark the book as borrowed
        } else {
            System.out.println("Sorry, " + books[choice] + " is currently unavailable. Please select another book.");
        }
    }
}
