package spring_introduction.spring_container_example.withXML.pet;

public class CatWithXml implements PetWithXml {
    public CatWithXml() {
        System.out.println("create Cat");
    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}
