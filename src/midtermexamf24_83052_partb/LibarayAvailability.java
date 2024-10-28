/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author sambh
 */
public class LibarayAvailability {
    
    public static boolean bookAvailable(int index){
        if (index < 0 || index >= LibraryItem.getBookAvailability().length) {
            return false;
        }
        return LibraryItem.getBookAvailability()[index];
        
    }
    
    public static void borrowedBook(int index){
        if (index > 0 && index < LibraryItem.getBookAvailability().length){
            LibraryItem.getBookAvailability()[index] = false;
        }
        
    }
  
    
}

