/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author Mankirat Singh Saluja
 */

import java.util.Scanner;

public class LibraryItem {
    
    private static String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
    private static boolean[] bookAvailability = {true, true, true, true}; // Initially all books are available
    
    public static String[] getBooks() {
        return books;
    }

    public static boolean[] getBookAvailability() {
        return bookAvailability;
    }

    public static void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i] + (bookAvailability[i] ? " (Available)" : " (Unavailable)"));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookSelector selector = new BookSelector(); // Instantiate the BookSelector class
        boolean continueBorrowing = true;

        while (continueBorrowing) {
            displayCatalog();
            System.out.print("\nEnter the number of the book you want to borrow: ");
            int choice = sc.nextInt() - 1; // Adjusting for 0-based indexing

            selector.selectBook(new LibraryItem(), choice); // Use BookSelector for selection

            System.out.print("\nWould you like to borrow another book? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            continueBorrowing = response.equals("yes");
        }

        System.out.println("Thank you for using the library!");
        sc.close();
    }
}
