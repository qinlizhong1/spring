package beanlifecycle;

import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@ToString
class Dog implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    private String name;
    private Integer age;
    public Dog(){
        System.out.println("1、无参构造函数被调用");
    }

    public void setName(String name){
        this.name = name;
        System.out.println("2、setName函数被调用");
    }

    public void setAge(Integer age){
        this.age = age;
        System.out.println("3、setAge函数被调用");
    }


    @Override
    public void setBeanName(String s) {
        System.out.println("4、【BeanNameAware】setBeanName函数被调用");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("5、【BeanFactoryAware】setBeanFactory函数被调用");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("6、【ApplicationContextAware】setApplicationContext函数被调用");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("8、【InitializingBean】afterPropertiesSet函数被调用");
    }

    public void initMethod(){
        System.out.println("9、【init-method】initMethod函数被调用");
    }

    public void destroy(){
        System.out.println("11、【DisposableBean】destroy函数被调用");
    }

    public void destroyMethod(){
        System.out.println("12、【destroy-method】destroyMethod函数被调用");
    }
}

