package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理：
 */
public class JdkDynamicProxy {
    public UserService getProxyObjct() {

        //目标对象
        UserService userService = new UserServiceImpl();

        //代理对象生成
        UserService userServiceProxy = (UserService)Proxy.newProxyInstance(JdkDynamicProxy.class.getClassLoader(),
                userService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("【jdk动态代理】：原始方法执行之前执行");
                method.invoke(userService, args);
                System.out.println("【jdk动态代理】：原始方法执行之后执行");
                return proxy;
            }
        });
        return userServiceProxy;
    }
}
