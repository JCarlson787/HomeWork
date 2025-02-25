/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WeekSixLab;

/**
 *
 * @author jesse
 */
public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    public boolean getIsBorrowed() {
        return isBorrowed;
    }
    
    public void borrowBook() {
        isBorrowed = true;
    }
    public void returnBook() {
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", isBorrowed=" + isBorrowed + '}';
    }
    
}
