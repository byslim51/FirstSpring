package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);

        Library library = context.getBean("libraryBean", Library.class);
        library.getBook("Преступление и Наказание");
        library.returnBook();
    }
}
