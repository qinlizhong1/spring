package complex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ComplexDITest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("complex/springContext.xml");

        Student student = (Student) applicationContext.getBean("stu1");

        System.out.println(student);
    }
}
