package methodbeforeadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodBeforeAdviceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("methodbeforeadvice/springContext.xml");

        UserService userService = (UserServiceImpl)applicationContext.getBean("userService");

        userService.login("qin", "123");
        userService.logout();
    }
}
