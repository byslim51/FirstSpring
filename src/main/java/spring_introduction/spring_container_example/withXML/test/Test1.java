package spring_introduction.spring_container_example.withXML.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.spring_container_example.withXML.pet.PetWithXml;

// Используется старый способ использование Спринг контейнера через xml (без аннотаций)
public class Test1 {
    public static void main(String[] args) {
        // Загрузка конфигурации
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextWithXml.xml");

        // Берем у спринг контейнера определенный бин, в нашем случае бин (объект) будет Cat
        PetWithXml pet = context.getBean("myPet", PetWithXml.class);
        pet.say();

        // Закрываем контекст
        context.close();
    }
}
