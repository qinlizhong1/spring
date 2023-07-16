package annotation.import_;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * Component注解修饰的类也会被Import整合
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {
    @Value("liuhuaqing")
    private String name;
    @Value("88")
    private Integer age;
}
