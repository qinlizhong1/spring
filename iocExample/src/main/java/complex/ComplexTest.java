package complex;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("complex/springContext.xml");
        System.out.println("----------------------- 通过FactoryBean接口方式创建的dog ------------------");
        Dog dog1 = (Dog)applicationContext.getBean("dog1");
        System.out.println(dog1);

        System.out.println("\n----------------------- 通过静态工厂方式方式创建的dog ------------------");
        Dog dog2 = (Dog)applicationContext.getBean("dog2");
        System.out.println(dog2);

        System.out.println("\n----------------------- 通过实例工厂方式方式创建的dog ------------------");
        Dog dog3 = (Dog)applicationContext.getBean("dog3");
        System.out.println(dog3);


        System.out.println("\n----------------------- FactoryBean接口方式中获取FactoryBean对象方式 ------------------");
        FactoryBean factoryBean = (FactoryBean) applicationContext.getBean("&dog1");
        System.out.println(factoryBean.getClass());
    }
}
