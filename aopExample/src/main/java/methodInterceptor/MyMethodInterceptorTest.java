package methodInterceptor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMethodInterceptorTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("methodInterceptor/springContext.xml");

        UserService userService = (UserService) applicationContext.getBean("userservice");
        userService.show("qin", 96.5);

        System.out.println("---------------------------------------------\n");

        LoginService loginService = (LoginService)applicationContext.getBean("loginservice");
        loginService.show("zhang", 90.0);
    }
}
