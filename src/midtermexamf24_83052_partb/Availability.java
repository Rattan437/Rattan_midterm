package midtermexamf24_83052_partb;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sangh
 */
public class Availability {
    private static boolean[] bookAvailability = {true, true, true, true}; // Initially all books are available

    public static boolean[] getBookAvailability() {
        return bookAvailability;
    }
    
    public static void setBookAvailability(boolean[] availibility) {
        bookAvailability = availibility;
    }
}
