package methodInterceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 目标方法执行前后都可以增强
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object object = null;

        System.out.println("原始方法是:" + invocation.getMethod().getName());
        Object[] arguments = invocation.getArguments();
        for (Object o : arguments){
            System.out.println("原始方法参数:" + o);
        }

        System.out.println(invocation.getClass());

        System.out.println("方法执行之前被调用");

        object = invocation.proceed();

        System.out.println("方法执行之后被调用");

        return object;
    }
}
