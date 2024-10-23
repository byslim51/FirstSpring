package spring_introduction.spring_container_example.withXML.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.spring_container_example.withXML.PersonWithXml;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextWithXml.xml");

        /**
         * Без Spring:
         */
//        Pet pet = new Cat();
//        Person person = new Person(pet);

//        System.out.println();
//        person.callYourPet();

        /**
         * С Spring, используется IoC:
         */

//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);

//        System.out.println();
//        person.callYourPet();


        /**
         * C Spring, используется IoC и DI:
         */
        PersonWithXml person = context.getBean("myPerson", PersonWithXml.class);

        System.out.println();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        person.callYourPet();

    }
}
