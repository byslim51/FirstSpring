package spring_introduction.spring_container_example.withAnnotation.pet;

import org.springframework.stereotype.Component;
import spring_introduction.spring_container_example.withXML.pet.PetWithXml;

@Component("catBean")
public class CatWithAnnotation implements PetWithAnnotation {
    public CatWithAnnotation() {
        System.out.println("create Cat");
    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}