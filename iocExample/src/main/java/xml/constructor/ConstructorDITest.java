package xml.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 构造函数注入
 */
public class ConstructorDITest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/constructor/springContext.xml");

        Student student = (Student) applicationContext.getBean("stu1");

        System.out.println(student);
    }
}
