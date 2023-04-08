package complex;

import org.springframework.beans.factory.FactoryBean;

//实现FactoryBean接口创建复杂对象
public class MyFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Cat("小猫1号", 10);
    }

    @Override
    public Class<?> getObjectType() {
        return Cat.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
