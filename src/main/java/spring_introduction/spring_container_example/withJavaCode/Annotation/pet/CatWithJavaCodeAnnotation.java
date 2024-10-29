package spring_introduction.spring_container_example.withJavaCode.Annotation.pet;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("catBean")
@Scope("prototype")
public class CatWithJavaCodeAnnotation implements PetWithJavaCodeAnnotation {
    private String name;

    public CatWithJavaCodeAnnotation() {
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