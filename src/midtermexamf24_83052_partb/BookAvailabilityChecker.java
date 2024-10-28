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

