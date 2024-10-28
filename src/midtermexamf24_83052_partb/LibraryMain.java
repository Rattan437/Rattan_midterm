/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

import java.util.Scanner;
/**
 *
 * @author sambh
 * Here I created a new class called LibraryMain where I added the main method from LibraryItem. I did this 
 * because LibraryItem is a class that is to do with all things related to the book/book
 * availability items such as getting and setting. 
 * A main method, should only be focused on interacting with the user and displaying output. 
 * 
 * One ood principle being used here is class abstraction, and high cohesion, therefore each class should have
 * elements within it that are working to fulfill a single task and a well-defined purpose. 
 *
 * 
 * Another ood principle being shown here is delegation, as when I call LibraryManager.displayCatalog() I am delegating 
 * that responsibility of displaying the catalog to another class, which no one is seeing. That is because you want the 
 * main class to be like a black box. 
 * 
 *
 */

public class LibraryMain {
    
        
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueBorrowing = true;

        while (continueBorrowing) {
            LibraryManager.displayCatalog();
            LibraryManager.selectBook(sc);

            System.out.print("\nWould you like to borrow another book? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            continueBorrowing = response.equals("yes");
        }

        System.out.println("Thank you for using the library!");
        sc.close();
    }
    
}
