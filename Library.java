/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6Lab2;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author jesse
 */
public class Library implements LibraryInterface {
    Book[] books; 

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean addBook(Book newbook) {
        if (books[books.length - 1] != null) {
            books = Arrays.copyOf(books, books.length + 1);
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newbook;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean borrowBookL(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title) && books[i].getIsBorrowed() == false) {
                books[i].borrowBook();
                return true;
            }   
        }
        return false;
    }

    @Override
    public boolean returnBookL(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title) && books[i].getIsBorrowed() == true) {
                books[i].returnBook();
                return true;
            } 
        }
        return false;
    }

    @Override
    public void listBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + ", borrowed status = " + books[i].getIsBorrowed());
            }
            
        }
    }

    @Override
    public int countAvailableBooks() {
        return books.length;
    }
    
    //@Override
    public String searchByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title) && books[i].getIsBorrowed() == false) {
                return books[i].getTitle();
            }
        }
        return "Book is borowed.";
    }

    public ArrayList<String> searchByAuthor(String author) {
        ArrayList<String> titles = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author) && books[i].getIsBorrowed() == false) {
                titles.add(books[i].getTitle());
            }
        }
        if (! titles.isEmpty()) {
            return titles;
        } else {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("No books by this author avalible");
            return empty;
        }
    }
    public int countBorrowedBooks() {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
           if (books[i].getIsBorrowed() == true) {
               count++;
           } 
        }
        return count;
    }
}
