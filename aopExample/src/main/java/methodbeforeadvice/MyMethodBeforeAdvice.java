package methodbeforeadvice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("原始方法是:" + method.getName());
        for (Object o : args){
            System.out.println("原始方法参数:" + o);
        }
        System.out.println("目标对象:" + target);
        System.out.println("方法执行之前被调用before");
    }
}
