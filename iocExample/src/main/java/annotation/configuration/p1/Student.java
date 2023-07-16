package annotation.configuration.p1;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class Student {
    private String name;
    private Integer age;
}
