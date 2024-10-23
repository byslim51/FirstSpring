package spring_introduction.spring_container_example.withXML.pet;

public class DogWithXml implements PetWithXml {
    public DogWithXml() {
        System.out.println("create Dog");
    }

    @Override
    public void say() {
        System.out.println("Гав-гав");
    }
}
