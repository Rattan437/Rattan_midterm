/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

import java.util.Scanner;
import static midtermexamf24_83052_partb.LibraryItem.displayCatalog;
import static midtermexamf24_83052_partb.LibraryItem.selectBook;

/**
 *
 * @author sangh
 *I ADDED THIS CLASS BECAUSE THE MAIN METHOD SHOULD BE IN ITS OWN CLASS. 
 * 
 *THIS IS AN EXAMPLE OF LOOSE COUPLING BECAUSE THE LibraryItem CLASS SHOULD HAVE LITTLE KNOWLEDGE OF THIS CLASS.
 * 
 */
public class Library {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        boolean continueBorrowing = true;

        while (continueBorrowing) {
            displayCatalog();
            selectBook(sc);

            System.out.print("\nWould you like to borrow another book? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            continueBorrowing = response.equals("yes");
        }

        System.out.println("Thank you for using the library!");
        sc.close();
    }
}
