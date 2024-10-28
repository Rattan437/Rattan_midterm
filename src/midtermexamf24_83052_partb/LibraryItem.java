/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermexamf24_83052_partb;

/**3
 *
 * @author fagun
 * @author Parth
 */

import java.util.Scanner;

import java.util.Scanner;

public class LibraryItem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryCatalog libraryCatalog = new LibraryCatalog(); // Encapsulation: Accessing LibraryCatalog instance
        boolean continueBorrowing = true;

        while (continueBorrowing) {
            libraryCatalog.displayCatalog();
            libraryCatalog.selectBook(sc);

            System.out.print("\nWould you like to borrow another book? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            continueBorrowing = response.equals("yes");
        }

        System.out.println("Thank you for using the library!");
        sc.close();
    }
}
