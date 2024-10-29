package spring_introduction.spring_container_example.withJavaCode.Code.pet;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class CatWithJavaCode implements PetWithJavaCode {
    private String name;

    public CatWithJavaCode() {
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