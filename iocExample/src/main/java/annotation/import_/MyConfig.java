package annotation.import_;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {TeacherConfig.class, Student.class})
public class MyConfig {
}
