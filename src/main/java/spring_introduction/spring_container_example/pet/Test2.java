package spring_introduction.spring_container_example.pet;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.spring_container_example.pet.pets.Cat;
import spring_introduction.spring_container_example.pet.pets.Pet;

public class Test2 {
    public static void main(String[] args) {
   /**
    * Без Spring:
    */
//        Pet pet = new Cat();
//        Person person = new Person(pet);

//        person.callYourPet();

   /**
   * С Spring (но еще имеются сильные зависимости):
   */
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        Person person = new Person(pet);

        person.callYourPet();

    }
}
