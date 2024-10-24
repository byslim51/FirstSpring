package spring_introduction.spring_container_example.withAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring_introduction.spring_container_example.withAnnotation.pet.PetWithAnnotation;
import spring_introduction.spring_container_example.withXML.pet.PetWithXml;

@Component("personBean")
public class PersonWithAnnotation {
//   Autowired для поля
    @Autowired
    @Qualifier("catBean")
    private PetWithAnnotation pet;

    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    /**
     * Autowired используется для использования DI с помощью аннотаций
     */
//    @Autowired
//    public PersonWithAnnotation(PetWithAnnotation pet) {
//        System.out.println("create Person");
//        this.pet = pet;
//    }

//    public PersonWithAnnotation() {
//        System.out.println("create Person");
//    }

    public void callYourPet() {
        System.out.println("Привет мой любимый питомец");
        pet.say();
    }


    /**
     * Autowired для сеттеров
     */
//    @Autowired
    public void setPet(PetWithAnnotation pet) {
        System.out.println("setPet Person");
        this.pet = pet;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("setSurname Person");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge Person");
        this.age = age;
    }
}
