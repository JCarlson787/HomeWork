/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Week6Lab2;

/**
 *
 * @author jesse
 */
public interface BookInterface {
    public abstract String getTitle();
    public abstract String getAuthor();
    public abstract void borrowBook();
    public abstract void returnBook();
    public abstract String toString();
}
