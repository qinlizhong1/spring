package complex;

import lombok.Data;

/**
 * 实例工厂方式创建复杂对象
 */

@Data
public class InstanceFactory {
    private String name;
    private Integer age;

    public Dog getInstance(){
        return new Dog(name, age);
    }
}
