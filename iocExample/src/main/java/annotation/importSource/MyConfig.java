package annotation.importSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:annotation/importSource/springContext.xml")
public class MyConfig {

    @Bean
    public Teacher teacher(){
        return new Teacher("唐老师", 66);
    }
}
