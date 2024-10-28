/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author krish
 */

//Single Responsiblity Principle applied by creating checkAvailability class to handle book availability checks.
public class CheckAvailability {
    public static boolean isBookAvailable(int bookIndex) {
        return LibraryItem.getBookAvailability()[bookIndex];
    }
}
