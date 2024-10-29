package spring_introduction.spring_container_example.withJavaCode.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationWithJavaCodeAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigWithAnnotation.class);

        PersonWithJavaCodeAnnotation person = context.getBean("personBean", PersonWithJavaCodeAnnotation.class);
        person.callYourPet();
    }
}
