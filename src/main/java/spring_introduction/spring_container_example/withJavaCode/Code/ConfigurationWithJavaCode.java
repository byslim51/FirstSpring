package spring_introduction.spring_container_example.withJavaCode.Code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.spring_container_example.withJavaCode.Code.pet.CatWithJavaCode;
import spring_introduction.spring_container_example.withJavaCode.Code.pet.PetWithJavaCode;

public class ConfigurationWithJavaCode {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigWithCode.class);

        PersonWithJavaCode person = context.getBean("personBean", PersonWithJavaCode.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        person.callYourPet();

    }
}
