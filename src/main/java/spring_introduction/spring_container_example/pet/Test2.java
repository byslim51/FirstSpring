package spring_introduction.spring_container_example.pet;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.spring_container_example.pet.pets.Cat;
import spring_introduction.spring_container_example.pet.pets.Pet;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        /**
         * Без Spring:
         */
//        Pet pet = new Cat();
//        Person person = new Person(pet);

//        System.out.println();
//        person.callYourPet();

        /**
         * С Spring, используется IoC (но еще имеются сильные зависимости):
         */

//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);

//        System.out.println();
//        person.callYourPet();


        /**
         * C Spring, используется IoC и DI:
         */
        Person person = context.getBean("myPerson", Person.class);

        System.out.println();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        person.callYourPet();

    }
}
