/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author Atinder
 */
public class BookAvailability implements BookService {
    
    //2. Encapsulation: This principle hides direct access to data, but rather interaction with methods.
    private static String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
    private static boolean[] bookAvailability = {true, true, true, true};

    @Override
    public boolean isAvailable(int index) {
        return bookAvailability[index];
    }

    @Override
    public void setAvailability(int index, boolean availability) {
        bookAvailability[index] = availability;
    }

    @Override
    public String[] getBooks() {
        return books;
    }
}
