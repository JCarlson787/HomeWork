/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6Lab2;

/**
 *
 * @author jesse
 */
public class Book implements BookInterface {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public String getAuthor() {
        return author;
    }
    
    public boolean getIsBorrowed() {
        return isBorrowed;
    }
  
    @Override
    public void borrowBook() {
        isBorrowed = true;
    }
    @Override
    public void returnBook() {
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", isBorrowed=" + isBorrowed + '}';
    }
    
    

}
