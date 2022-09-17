package beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("beanlifecycle/springContext.xml");

        Dog dog = (Dog)abstractApplicationContext.getBean("dog1");

        abstractApplicationContext.close();

        System.out.println("\n" + dog);

    }
}
