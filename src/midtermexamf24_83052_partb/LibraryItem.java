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
    
    private static String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
    private static boolean[] bookAvailability = {true, true, true, true}; // Initially all books are available
    
    //an empty constructor for values input
    public LibraryItem() {
    }
    
    //getter and setters are created for books and bookAvailability
    //It is called encapsulatiuon. It is done to hide the data from the user so that they cannot make any changes.
    public static String[] getBooks() {
        return books;
    }

    public static void setBooks(String[] books) {
        LibraryItem.books = books;
    }

    public static boolean[] getBookAvailability() {
        return bookAvailability;
    }

    public static void setBookAvailability(boolean[] bookAvailability) {
        LibraryItem.bookAvailability = bookAvailability;
    }
    
    //It is a method to display the books that are available
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
        
        //Object of class BookAvailability is Instanciated to access the class through an object
        BookAvailability find = new BookAvailability();
        
        //Here the if/else is run using the separated class of object find.
        //High Cohesion aqnd low coupling are used here.
        //low coupling makes each and every class independent upto an extent 
        //High cohesion is to give a particular task to every method
        if (find.bookAva(choice)) {
            System.out.println("You selected: " + books[choice] + ". Enjoy your reading!");
            bookAvailability[choice] = false;
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
