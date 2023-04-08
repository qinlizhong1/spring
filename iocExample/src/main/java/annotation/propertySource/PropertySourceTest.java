package annotation.propertySource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        Dog dog = (Dog)applicationContext.getBean("dog");
        System.out.println(dog);
    }
}
