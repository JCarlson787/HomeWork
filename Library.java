/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WeekSixLab;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author jesse
 */
public class Library {
    Book[] books;   
    
    public Library(Book[] books) {
        this.books = books;
    
    }
    public boolean borrowBookL(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title) && books[i].getIsBorrowed() == false) {
                books[i].borrowBook();
                System.out.println("Book borrowed successfully.");
                return true;
            }   
        }
        System.out.println("This book is unavailable.");
        return false;
    }
    
    public boolean returnBookL(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title) && books[i].getIsBorrowed() == true) {
                books[i].returnBook();
                System.out.println("Book returned successfully.");
                return true;
            } 
        }
        System.out.println("Book already returned.");
        return false;
    }
    public String listBooks() {
        String list = "";
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                list += books[i].getTitle() + " is authored by, " + books[i].getAuthor() + ", borrowed status = " + books[i].getIsBorrowed() + "\n";
                
            }
            
        }
        return list;
    }
    public void addBook(Book newbook) {
        if (books[books.length - 1] != null) {
            books = Arrays.copyOf(books, books.length + 1);
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newbook;
            }
        }
    }
    
    public int countAvailableBooks() {
        return books.length;
    }
    
    public String searchByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title) && books[i].getIsBorrowed() == false) {
                return books[i].getTitle() + " is available";
            }      
        }
        return title + " is not available";
    }
    
    public ArrayList<String> searchByAuthor(String author) {
        ArrayList<String> booksAuthor = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author) && books[i].getIsBorrowed() == false) {
                booksAuthor.add(books[i].getTitle() + "\n");
            }
        }
        if (! booksAuthor.isEmpty() ) {
            return booksAuthor;
        } else { 
            ArrayList<String> noBook = new ArrayList<>();
            noBook.add("No books by this author avalible"); 
            return noBook;
        }
    }

    public String findBorrowed() {
        String borrowed = "";
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getIsBorrowed() == true) {
                borrowed += books[i].getTitle() + "\n";
            } 
        }
        return borrowed;
    }

}
