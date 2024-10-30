package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook(String bookName) {
        System.out.println("Мы взяли книгу " + bookName + "\n");
    }

    public boolean returnBook() {
        System.out.println("Мы вернули книгу \n");
        return true;
    }
}
