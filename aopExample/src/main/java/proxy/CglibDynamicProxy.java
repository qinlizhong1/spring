package proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib动态代理：注意是通过实现MethodInterceptor接口增加额外功能
 * enhancer.setCallback()的参数是MethodInterceptor接口实现类对象
 */
public class CglibDynamicProxy {
    public LoginService getProxyObjct() {
        LoginService loginService = new LoginService();

        Enhancer enhancer = new Enhancer();

        //类加载器
        enhancer.setClassLoader(CglibDynamicProxy.class.getClassLoader());

        //loginService.getClass().getSuperclass()这个写法是错误的
        enhancer.setSuperclass(loginService.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("【cglib动态代理】：原始方法执行之前执行");
                method.invoke(loginService, objects);
                System.out.println("【cglib动态代理】：原始方法执行之后执行");
                return o;
            }
        });

        LoginService loginServiceProxy = (LoginService)enhancer.create();
        return loginServiceProxy;
    }
}
