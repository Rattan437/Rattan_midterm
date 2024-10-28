/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author krish
 */
public class CheckAvailability {
    public static boolean isBookAvailable(int bookIndex) {
        return LibraryItem.getBookAvailability()[bookIndex];
    }
}
