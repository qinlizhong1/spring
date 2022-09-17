package beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware, BeanPostProcessor {
    private String dogName;
    private String dogColor;

    public Dog() {
        System.out.println("Dog() 无参构造函数被调用");
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
        System.out.println("setDogName 函数(setter)被调用");
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogColor='" + dogColor + '\'' +
                '}';
    }

    //可以给多个方法使用@PostConstruct注解
    @PostConstruct
    public void postConstruct1(){
        System.out.println("postConstruct1 函数被调用");
    }

    @PostConstruct
    public void postConstruct2(){
        System.out.println("postConstruct2 函数被调用");
    }

    //InitializingBean方法
    public void afterPropertiesSet() throws Exception {
        System.out.println("【InitializingBean】afterPropertiesSet 函数被调用");
    }

    public void initMetod(){
        System.out.println("initMetod 函数被调用");
    }


    @PreDestroy
    public void preDestroy1(){
        System.out.println("preDestroy1 函数被调用");
    }

    @PreDestroy
    public void preDestroy2(){
        System.out.println("preDestroy2 函数被调用");
    }

    public void destroyMethod(){
        System.out.println("destroyMethod 函数被调用");
    }

    //DisposableBean中方法
    public void destroy() throws Exception {
        System.out.println("【DisposableBean】destroy 函数被调用");
    }

    //BeanFactoryAware中方法
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【BeanFactoryAware】setBeanFactory 函数被调用,参数值：" + beanFactory);
    }

    //BeanNameAware中方法
    public void setBeanName(String s) {
        System.out.println("【BeanNameAware】setBeanName 函数被调用, 参数值：" + s);
    }

    //ApplicationContextAware中方法
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【ApplicationContextAware】setApplicationContext 函数被调用, 参数值：" + applicationContext);
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName){
        System.out.println("【BeanPostProcessor】postProcessBeforeInitialization 函数被调用, 参数值beanName：" + beanName);
        return "BeforeInitialization";
    }

    public Object postProcessAfterInitialization(Object bean, String beanName){
        System.out.println("【BeanPostProcessor】postProcessAfterInitialization 函数被调用, 参数值beanName：" + beanName);
        return "AfterInitialization";
    }
}
