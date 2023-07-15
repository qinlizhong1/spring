package complex;

import lombok.Data;

/**
 * 静态工厂方式创建复杂对象
 */

@Data
public class StaticFactory {
    private static String name;
    private static Integer age;

    public static Dog getInstance(){
        return new Dog(name, age);
    }
}
