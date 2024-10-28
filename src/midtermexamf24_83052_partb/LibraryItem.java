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

import java.util.Scanner;

public class LibraryItem {
        
    public LibraryItem() {
    }
     private static Book[] books = {
        new Book("The Great Gatsby"), 
        new Book("1984"), 
        new Book("To Kill a Mockingbird"), 
        new Book("The Catcher in the Rye")
    };
    
    private static BookAvailablityChecker availabilityChecker = new BookAvailablityChecker(books);

    public static void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i].getTitle());
        }
    }
    
    public static void selectBook(Scanner sc) {
        System.out.print("\nEnter the number of the book you want to borrow: ");
        int choice = sc.nextInt() - 1; // Adjust for 0-based indexing
        if (choice < 0 || choice >= books.length) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }

        if (availabilityChecker.isAvailable(choice)) {
            System.out.println("You selected: " + books[choice].getTitle() + ". Enjoy your reading!");
            availabilityChecker.markAsBorrowed(choice);
        } else {
            System.out.println("Sorry, " + books[choice].getTitle() + " is currently unavailable. Please select another book.");
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
