package midtermexamf24_83052_partb;

/**
 * Class representing the availability of books in the library.
 * 
 * @author dudej
 */
public class bookAvailable {
    
    private String[] bookList; 
    private boolean[] availabilityStatus; 

    public bookAvailable(String[] bookList, boolean[] availabilityStatus) {
        this.bookList = bookList;
        this.availabilityStatus = availabilityStatus;
    }

    public boolean isBookAvailable(int index) {
        if (index < 0 || index >= availabilityStatus.length) {
            return false; // Invalid index
        }
        return availabilityStatus[index];
    }

    public void borrowBook(int index) {
        if (isBookAvailable(index)) {
            availabilityStatus[index] = false; // Mark the book as borrowed
        }
    }
}
