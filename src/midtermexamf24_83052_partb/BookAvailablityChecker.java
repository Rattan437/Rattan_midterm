/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author makkaarm
 */
public class BookAvailablityChecker {
    
    private static boolean[] bookAvailability = {true, true, true, true}; 

    public static boolean isAvailable(int bookIndex) {
        return bookAvailability[bookIndex];
    }

    public static void markAsBorrowed(int bookIndex) {
        bookAvailability[bookIndex] = false;
    }
}