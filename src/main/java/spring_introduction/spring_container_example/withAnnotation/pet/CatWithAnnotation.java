package spring_introduction.spring_container_example.withAnnotation.pet;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring_introduction.spring_container_example.withXML.pet.PetWithXml;

@Component("catBean")
@Scope("prototype")
public class CatWithAnnotation implements PetWithAnnotation {
    private String name;

    public CatWithAnnotation() {
        System.out.println("create Cat");
    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}