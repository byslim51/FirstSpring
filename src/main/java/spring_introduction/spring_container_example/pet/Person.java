package spring_introduction.spring_container_example.pet;

import spring_introduction.spring_container_example.pet.pets.Pet;

public class Person {
    private Pet pet;

    private String surname;
    private int age;

    public Person(Pet pet) {
        System.out.println("create Person");
        this.pet = pet;
    }

    public Person() {
        System.out.println("create Person");
    }

    public void callYourPet() {
        System.out.println("Привет мой любимый питомец");
        pet.say();
    }

    public void setPet(Pet pet) {
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
