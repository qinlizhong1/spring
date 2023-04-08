package annotation.propertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/annotation/propertySource/dog.properties")
public class MyConfig {
    @Value("${dog.name}")
    private String name;
    @Value("${dog.age}")
    private Integer age;

    @Bean
    public Dog dog(){
        return new Dog(name, age);
    }
}
