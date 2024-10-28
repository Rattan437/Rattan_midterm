package midtermexamf24_83052_partb;

/**
 * LibraryInventory is responsible for managing the availability of books.
 * 
 * Principle: Single Responsibility Principle (SRP)
 * This class has one reason to change - managing book availability.
 */
public class LibraryInventory {

    // Encapsulated book availability data
    private static boolean[] bookAvailability = {true, true, true, true};

    /**
     * Checks if the book at the specified index is available.
     *
     * Principle: Encapsulation
     * The availability array is private, and access is controlled via methods.
     */
    public static boolean isBookAvailable(int index) {
        return index >= 0 && index < bookAvailability.length && bookAvailability[index];
    }

    /**
     * Marks a book as borrowed by setting its availability to false.
     *
     * Principle: Encapsulation
     * Only this class can change book availability, maintaining control over the data.
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
     * Book return updates are controlled, reinforcing data consistency.
     */
    public static void returnBook(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            bookAvailability[index] = true;
        }
    }
}
