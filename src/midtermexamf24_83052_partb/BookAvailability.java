/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author Atinder
 */
public class BookAvailability {
    
    private static boolean[] bookAvailability = {true, true, true, true}; // Initially all books are available
        
     public static boolean[] getBookAvailability() {
        return bookAvailability;
    }

    public static void setBookAvailability(boolean[] bookAvailability) {
        BookAvailability.bookAvailability = bookAvailability;
    }
    
    public static boolean isAvailable(int index){
        return bookAvailability[index];
    }
    
    public static void borrowBook(int index){
        bookAvailability[index] = false;
    }
}
