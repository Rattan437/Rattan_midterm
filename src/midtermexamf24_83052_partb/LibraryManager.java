/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

import java.util.Scanner;

/**
 *
 * @author sambh
 * Here I created a new class called LibraryManager where I added the methods from LibraryItem that were not to do 
 * with getting or setting the books/availability. 
 * I did this because LibraryItem is a class that is to do with all things related to the book item.  
 *
 * The ood principle being used here is class abstraction, and high cohesion, therefore each class should have
 * elements within it that are working to fulfill a single task and a well-defined purpose. 
 * 
 */
public class LibraryManager {
        public static void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");
        for (int i = 0; i < LibraryItem.getBooks().length; i++) {
            System.out.println((i + 1) + ". " + LibraryItem.getBooks()[i]);
        }
    }
    public static void selectBook(Scanner sc) {
        System.out.print("\nEnter the number of the book you want to borrow: ");
        int choice = sc.nextInt() - 1; // Adjusting for 0-based indexing

        if (choice < 0 || choice >= LibraryItem.getBooks().length) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }
        
        
        if (LibarayAvailability.bookAvailable(choice)){
            System.out.println("You selected: " + LibraryItem.getBooks()[choice] + ". Enjoy your reading!");
            LibarayAvailability.borrowedBook(choice); // Mark the book as borrowed
        } else {
            System.out.println("Sorry, " + LibraryItem.getBooks()[choice] + " is currently unavailable. Please select another book.");
        }
        
     }
}
    
