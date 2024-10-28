/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author fagun
 */

public class LibraryItem {
    
    private static String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
    private static boolean[] bookAvailability = {true, true, true, true}; // Initially all books are available
    
    public LibraryItem() {
    }

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
}
