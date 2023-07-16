package annotation.configuration.p2;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class Teacher {
    private String name;
    private Integer age;
}
