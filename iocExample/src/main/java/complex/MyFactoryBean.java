package complex;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

/**
 * 实现FactoryBean接口创建复杂对象
 */
@Data
public class MyFactoryBean implements FactoryBean {
    private String name;
    private Integer age;

    @Override
    public Object getObject() throws Exception {
        return new Dog(name, age);
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
