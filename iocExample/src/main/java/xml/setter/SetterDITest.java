package xml.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * setter注入
 */
public class SetterDITest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/setter/springContext.xml");

        Student student = (Student) applicationContext.getBean("stu1");

        System.out.println(student);
    }
}
