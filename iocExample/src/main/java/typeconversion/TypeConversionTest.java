package typeconversion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TypeConversionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("typeconversion/springContext.xml");

        Teacher teacher = (Teacher)applicationContext.getBean("teacher");
        System.out.println(teacher);
    }
}
