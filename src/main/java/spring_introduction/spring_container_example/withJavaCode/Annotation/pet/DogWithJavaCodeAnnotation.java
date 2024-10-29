package spring_introduction.spring_container_example.withJavaCode.Annotation.pet;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DogWithJavaCodeAnnotation implements PetWithJavaCodeAnnotation {
    public DogWithJavaCodeAnnotation() {
        System.out.println("create Dog");
    }

    @Override
    public void say() {
        System.out.println("Гав-гав");
    }
}

