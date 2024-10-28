package midtermexamf24_83052_partb;

import java.util.Scanner;

/**
 * LibraryItem class is responsible for user interaction related to borrowing books.
 * 
 * Principle: Single Responsibility Principle (SRP)
 * This class focuses on user interaction and book selection, while availability checks are handled by LibraryInventory.
 */
public class LibraryItem {

    // Encapsulated book catalog
    private static String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};

    /**
     * Displays the catalog of books to the user.
     */
    public static void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    /**
     * Allows the user to select a book to borrow, using LibraryInventory for availability checks.
     *
     * Principle: Single Responsibility Principle (SRP)
     * This method delegates availability checks and updates to LibraryInventory, following SRP.
     */
    public static void selectBook(Scanner sc) {
        System.out.print("\nEnter the number of the book you want to borrow: ");
        int choice = sc.nextInt() - 1;

        if (choice < 0 || choice >= books.length) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }

        // Delegates availability check and borrow operation to LibraryInventory
        if (LibraryInventory.isBookAvailable(choice)) {
            System.out.println("You selected: " + books[choice] + ". Enjoy your reading!");
            LibraryInventory.borrowBook(choice); // Updates availability in LibraryInventory
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
