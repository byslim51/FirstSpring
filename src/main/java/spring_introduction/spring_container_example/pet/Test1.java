package spring_introduction.spring_container_example.pet;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.spring_container_example.pet.pets.Pet;

// Используется старый способ использование Спринг контейнера через xml (без аннотаций)
public class Test1 {
    public static void main(String[] args) {
        // Загрузка конфигурации
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Берем у спринг контейнера определенный бин, в нашем случае бин (объект) будет Cat
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        // Закрываем контекст
        context.close();
    }
}
