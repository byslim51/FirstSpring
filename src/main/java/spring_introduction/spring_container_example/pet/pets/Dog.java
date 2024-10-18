package spring_introduction.spring_container_example.pet.pets;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Гав-гав");
    }
}
