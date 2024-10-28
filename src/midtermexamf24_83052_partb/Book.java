package midtermexamf24_83052_partb;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author makkaarm
 */

// Encapsulation: The properties of the book (title and available) are private, ensuring that they cannot be accessed directly from outside the class. Access is provided through getter and setter methods.
//Single Responsibility Principle: Used in the Book Class: This class is responsible only for the details of a book (title and availability). If changes are needed regarding book properties, this class can be modified without affecting other classes.
public class Book {
    
private String title; 
private boolean available; 

    public Book(String title) {
        this.title = title;
        this.available = true; 
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}