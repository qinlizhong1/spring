package typeconversion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TypeconversionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("typeconversion/springContext.xml");

        Student student = (Student)applicationContext.getBean("student");
        System.out.println(student);
    }
}
