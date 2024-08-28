package edu.panov.spring.service;

import edu.panov.spring.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniversityLibraryService extends AbstractLibrary {

    private Book book;

    @Autowired
    public UniversityLibraryService(Book book) {
        this.book = book;
    }

    @Override
    public void printBook() {
        System.out.println("printBook University Library Service");
    }

    public void returnBook() {
        System.out.println("return book: university library service");
    }

    public void printMagazine() {
        System.out.println("printMagazine University Library Service");
    }

    public void printNeedBook(Book book) {
        System.out.println("printNeedBook Book " + book.getName());
    }

    public void printNeedBook(String... bookNames) {
        System.out.println("printNeedBook String " + bookNames[0]);
    }

    public Book getBook() {
        System.out.println("GET BOOK University Library Service " + book.getName());
        return book;
    }
}
