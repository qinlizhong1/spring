package methodInterceptor;

/**
 * 被MethodInterceptor增强的类不一定需要实现接口
 */
public class LoginService{
    public void show(String name, Double score){
        System.out.println("【LoginService业务方法执行】name:" + name + "    score:" + score);
    }


}

