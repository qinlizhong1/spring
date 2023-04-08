package beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanlifecycle/springContext.xml");

        Dog dog = (Dog)applicationContext.getBean("dog");
        System.out.println(dog);

        applicationContext.close();

    }
}
