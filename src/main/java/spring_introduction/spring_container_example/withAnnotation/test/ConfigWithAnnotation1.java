package spring_introduction.spring_container_example.withAnnotation.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.spring_container_example.withAnnotation.PersonWithAnnotation;
import spring_introduction.spring_container_example.withAnnotation.pet.CatWithAnnotation;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContextWithAnnotation.xml");

        CatWithAnnotation myCat = context.getBean("catBean", CatWithAnnotation.class);
        myCat.setName("123");
        CatWithAnnotation myCat2 = context.getBean("catBean", CatWithAnnotation.class);
        System.out.println();
        System.out.println(myCat2.getName());

        PersonWithAnnotation person = context.getBean("personBean", PersonWithAnnotation.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
