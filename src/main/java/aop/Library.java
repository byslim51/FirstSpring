package aop;

import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Component("libraryBean")
public class Library {
    public void getBook() {
        System.out.println("Мы взяли книгу\n");
    }

    public void returnBook() {
        System.out.println("Мы вернули книгу \n");
    }

    public void getMagazine() {
        System.out.println("Мы взяли журнал\n");
    }

    public void addBook(String book, String person_name) {
        System.out.println("Мы добавили книгу");
    }
}
