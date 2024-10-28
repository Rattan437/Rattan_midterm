/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package midtermexamf24_83052_partb;

/**
 *
 * @author Atinder
 */
public interface BookService {
    boolean isAvailable(int index);
    void setAvailability(int index, boolean availability);
    String[] getBooks();
}
