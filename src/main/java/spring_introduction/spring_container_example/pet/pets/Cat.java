package spring_introduction.spring_container_example.pet.pets;

public class Cat implements Pet {
    public Cat() {
        System.out.println("create Cat");
    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}
