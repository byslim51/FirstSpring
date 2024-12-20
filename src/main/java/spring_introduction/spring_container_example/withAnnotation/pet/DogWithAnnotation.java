package spring_introduction.spring_container_example.withAnnotation.pet;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring_introduction.spring_container_example.withXML.pet.PetWithXml;

@Component
@Scope("prototype")
public class DogWithAnnotation implements PetWithAnnotation {
    public DogWithAnnotation() {
        System.out.println("create Dog");
    }

    @Override
    public void say() {
        System.out.println("Гав-гав");
    }
}

