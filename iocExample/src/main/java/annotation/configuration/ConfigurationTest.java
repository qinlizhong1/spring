package annotation.configuration;

import annotation.configuration.p1.MyConfig;
import annotation.configuration.p1.Student;
import annotation.configuration.p2.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        Student student = (Student) applicationContext.getBean("student");

        System.out.println(student);

        System.out.println("-------------------------- -----------------------");
        Teacher teacher = (Teacher)applicationContext.getBean("teacher");
        System.out.println(teacher);
    }
}
