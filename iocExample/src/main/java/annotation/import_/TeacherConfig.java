package annotation.import_;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherConfig {
    @Bean
    public Teacher teacher(){
        return new Teacher("张老师", 18);
    }
}
