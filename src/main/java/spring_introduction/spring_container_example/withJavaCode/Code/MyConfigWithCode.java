package spring_introduction.spring_container_example.withJavaCode.Code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring_introduction.spring_container_example.withJavaCode.Code.pet.CatWithJavaCode;
import spring_introduction.spring_container_example.withJavaCode.Code.pet.PetWithJavaCode;

@Configuration
// PropertySource указывает где находиться файл с properties для value
@PropertySource("classpath:myApp.properties")
public class MyConfigWithCode {

    @Bean
    public PetWithJavaCode catBean() {
        return new CatWithJavaCode();
    }

    @Bean
    public PersonWithJavaCode personBean() {
        return new PersonWithJavaCode(catBean());
    }
}
