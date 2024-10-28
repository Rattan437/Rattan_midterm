/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author owner
 */

import java.util.Scanner;

public class BookSelector {

    public void selectBook(LibraryItem library, int bookIndex) {
        if (bookIndex < 0 || bookIndex >= library.getBooks().length) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }

        if (library.getBookAvailability()[bookIndex]) {
            System.out.println("You selected: " + library.getBooks()[bookIndex] + ". Enjoy your reading!");
            library.getBookAvailability()[bookIndex] = false; // Mark the book as borrowed
        } else {
            System.out.println("Sorry, " + library.getBooks()[bookIndex] + " is currently unavailable. Please select another book.");
        }
    }
}
