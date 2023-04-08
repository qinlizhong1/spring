package annotation.importSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportSourceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        Teacher teacher = (Teacher)applicationContext.getBean("teacher");
        System.out.println(teacher);

        System.out.println("--------------------------------------------------------");

        Student student = (Student)applicationContext.getBean("student");
        System.out.println(student);
    }
}
