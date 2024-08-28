package edu.panov.spring.service;

import edu.panov.spring.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibraryService extends AbstractLibrary {

    private Book book;

    @Autowired
    public SchoolLibraryService(Book book) {
        this.book = book;
    }

    @Override
    public void printBook() {
        System.out.println("School Library Service");
    }

    public void getMagazine() {
        System.out.println("getMagazine School Library Service");
    }

    public void returnBook() {
        System.out.println("returnBook School Library Service");
    }

    public void returnMagazine() {
        System.out.println("returnMagazine School Library Service");
    }

    public Book getBook() {
        System.out.println("GET BOOK School Library Service " + book.getName());
        return book;
    }
}
