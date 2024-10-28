package midtermexamf24_83052_partb;

public class LibraryInventory {

    private static boolean[] bookAvailability = {true, true, true, true}; // Initially, all books are available

    public static boolean isBookAvailable(int index) {
        if (index < 0 || index >= bookAvailability.length) {
            return false; // Out of bounds, assume not available
        }
        return bookAvailability[index];
    }

    public static void borrowBook(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            bookAvailability[index] = false; // Mark the book as borrowed
        }
    }

    public static void returnBook(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            bookAvailability[index] = true; // Mark the book as available
        }
    }
}
