package midtermexamf24_83052_partb;

/**
 * Class representing the availability of books in the library.
 * 
 * @author dudej
 */
public class bookAvailable {
    
    // this class solely handles user interaction and displaying book catalog - high cohesion
    // Encapsulation - keeping it private so that no one can modify it, instead methods are made public to access these.
    private String[] bookList; 
    private boolean[] availabilityStatus; 

    public bookAvailable(String[] bookList, boolean[] availabilityStatus) {
        this.bookList = bookList;
        this.availabilityStatus = availabilityStatus;
    }

    public boolean isBookAvailable(int index) {
        return index >= 0 && index < availabilityStatus.length && availabilityStatus[index];
    }

    public void borrowBook(int index) {
        if (isBookAvailable(index)) {
            availabilityStatus[index] = false; // Mark the book as borrowed
        }
    }

    public void returnBook(int index) {
        if (index >= 0 && index < availabilityStatus.length) {
            availabilityStatus[index] = true; // Mark the book as available
        }
    }

    public String[] getBookList() {
        return bookList;
    }
}
