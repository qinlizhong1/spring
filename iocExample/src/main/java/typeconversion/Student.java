package typeconversion;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Student {
    private String name;
    private Date birthday;
}
