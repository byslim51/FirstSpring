package spring_introduction.spring_container_example.pet.pets;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}
