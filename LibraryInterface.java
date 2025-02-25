/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Week6Lab2;

/**
 *
 * @author jesse
 */
public interface LibraryInterface {
    public abstract boolean addBook(Book newBook);
    public abstract boolean borrowBookL(String title);
    public abstract boolean returnBookL(String title);
    public abstract void listBooks();
    public abstract int countAvailableBooks();
    //public abstract String searchByTitle(String title);
}
