package spring_introduction.spring_container_example.withJavaCode.Code.pet;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class DogWithJavaCode implements PetWithJavaCode {
    public DogWithJavaCode() {
        System.out.println("create Dog");
    }

    @Override
    public void say() {
        System.out.println("Гав-гав");
    }
}

