/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author hp
 */
public class BookAvailability {
    
    public boolean bookAva(int index) {
        boolean[] bookAvailability = LibraryItem.getBookAvailability();
        return bookAvailability[index];
    }
}
