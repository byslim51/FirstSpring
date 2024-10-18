package spring_introduction.spring_container_example.pet;

import spring_introduction.spring_container_example.pet.pets.Pet;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Привет мой любимый питомец");
        pet.say();
    }
}
