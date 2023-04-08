package collectionProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionPropertyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectionProperty/springContext.xml");

        Student student = (Student)applicationContext.getBean("student");
        System.out.println(student);

        System.out.println("--------------------------------------------------------------------------------------------------");

        CollectionBasicType collectionBasicType = (CollectionBasicType) applicationContext.getBean("collectionBasicType");
        System.out.println(collectionBasicType);
    }
}
