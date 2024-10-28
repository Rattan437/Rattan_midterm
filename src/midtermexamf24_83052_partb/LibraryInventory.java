package midtermexamf24_83052_partb;

/**
 * LibraryInventory manages the availability status of each book.
 * 
 * Principle: Single Responsibility Principle (SRP)
 * This class handles a single task: managing book availability.
 */
public class LibraryInventory {

    // Private array for book availability
    private static boolean[] bookAvailability = {true, true, true, true};

    /**
     * Checks if a specific book is available.
     *
     * Principle: Encapsulation
     * The availability data is private and accessible only via methods.
     */
    public static boolean isBookAvailable(int index) {
        return index >= 0 && index < bookAvailability.length && bookAvailability[index];
    }

    /**
     * Marks a book as borrowed by setting its availability to false.
     *
     * Principle: Encapsulation
     * Only this class can update book availability, ensuring data consistency.
     */
    public static void borrowBook(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            bookAvailability[index] = false;
        }
    }

    /**
     * Marks a book as returned by setting its availability to true.
     *
     * Principle: Encapsulation
     * Controlled data updates reinforce data integrity.
     */
    public static void returnBook(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            bookAvailability[index] = true;
        }
    }
}
