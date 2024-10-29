package spring_introduction.spring_container_example.withJavaCode.Code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring_introduction.spring_container_example.withJavaCode.Code.pet.PetWithJavaCode;

public class PersonWithJavaCode {
    private PetWithJavaCode pet;

    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public PersonWithJavaCode(@Qualifier("catBean") PetWithJavaCode pet) {
        System.out.println("create Person");
        this.pet = pet;
    }

//    public PersonWithJavaCode() {
//        System.out.println("create Person");
//    }

    public void callYourPet() {
        System.out.println("Привет мой любимый питомец");
        pet.say();
    }



    public void setPet(PetWithJavaCode pet) {
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
