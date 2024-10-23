package spring_introduction.spring_container_example.withXML;

import spring_introduction.spring_container_example.withXML.pet.PetWithXml;

public class PersonWithXml {
    private PetWithXml pet;

    private String surname;
    private int age;

    public PersonWithXml(PetWithXml pet) {
        System.out.println("create Person");
        this.pet = pet;
    }

    public PersonWithXml() {
        System.out.println("create Person");
    }

    public void callYourPet() {
        System.out.println("Привет мой любимый питомец");
        pet.say();
    }

    public void setPet(PetWithXml pet) {
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
