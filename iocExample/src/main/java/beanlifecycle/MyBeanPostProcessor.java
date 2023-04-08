package beanlifecycle;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws org.springframework.beans.BeansException {
        System.out.println("7、【BeanPostProcessor】postProcessBeforeInitialization函数被调用");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws org.springframework.beans.BeansException {
        System.out.println("10、【BeanPostProcessor】postProcessAfterInitialization函数被调用");
        return bean;
    }

}
