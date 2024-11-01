package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.print.Book;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);

        Library library = context.getBean("libraryBean", Library.class);
        library.addBook("Книга 123", "Алекс");
    }
}
