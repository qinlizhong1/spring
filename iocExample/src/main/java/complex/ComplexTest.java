package complex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("complex/springContext.xml");
        Cat cat1 = (Cat)applicationContext.getBean("cat1");
        System.out.println(cat1);
        System.out.println("-------------------------------------------------------");

        Cat cat2 = (Cat)applicationContext.getBean("cat2");
        System.out.println(cat2);
        System.out.println("-------------------------------------------------------");

        Cat cat3 = (Cat)applicationContext.getBean("cat3");
        System.out.println(cat3);

    }
}
