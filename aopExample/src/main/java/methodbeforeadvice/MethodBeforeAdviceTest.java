package methodbeforeadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodBeforeAdviceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("methodbeforeadvice/springContext.xml");

        UserService userService = (UserService) applicationContext.getBean("userservice");
        userService.show("qin", 98.5);

        System.out.println("---------------------------------------------\n");

        LoginService loginService = (LoginService)applicationContext.getBean("loginservice");
        loginService.show("zhang", 100.0);
    }
}
