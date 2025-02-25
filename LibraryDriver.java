/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WeekSixLab;

import java.util.ArrayList;

/**
 *
 * @author jesse
 */
public class LibraryDriver {
    public static void main(String[] args) {
        Book learnJava17 = new Book("learnJava17", "Nick Samoylov");
        Book thePrince = new Book("thePrince", "machiavelli");
        Book Bible = new Book("Bible", "God");
        Book kingLear = new Book("kingLear", "Bill");
        Book theTwoTowers = new Book("theTwoTowers", "J.RR");
        Book greatGatsby = new Book("greatGatsby", "F.Scot");
        Book[] manyBooks = {kingLear, theTwoTowers, greatGatsby};  
        Library library = new Library(manyBooks);
        library.borrowBookL("kingLear");
        library.borrowBookL("kingLear");
        library.returnBookL("kingLear");
        System.out.println();
        System.out.println(library.listBooks());
        library.addBook(Bible);
        library.addBook(learnJava17);
        library.addBook(thePrince);
        library.borrowBookL("theTwoTowers");
        System.out.println(library.listBooks());
        library.returnBookL("theTwoTowers");
        library.returnBookL("theTwoTowers");
        int x = library.countAvailableBooks();
        System.out.println("This is the number of books in the library: " + x);
        System.out.println();
        String serchT = library.searchByTitle("greatGatsby");
        System.out.println("This is the book you searched for " + serchT);
        System.out.println();
        ArrayList<String> searchA = library.searchByAuthor("machiavelli");
        System.out.println("These are all the books by the author you searched for.");
        System.out.println(searchA);
        
    }
}
