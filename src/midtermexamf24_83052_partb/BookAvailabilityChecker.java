/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author tanjotsingh
 */
public class BookAvailabilityChecker {
    
// Principle: Cohesion
    // The BookAvailabilityChecker class is solely responsible for managing the availability of books,
    // making it highly cohesive as its methods focus only on availability checking and updating.
    public static boolean isAvailable(int bookIndex, boolean[] availability) {
        if (bookIndex < 0 || bookIndex >= availability.length) {
            return false;
        }
        return availability[bookIndex];
    }

    public static void markAsBorrowed(int bookIndex, boolean[] availability) {
        if (bookIndex >= 0 && bookIndex < availability.length) {
            availability[bookIndex] = false;
        }
    }
}
