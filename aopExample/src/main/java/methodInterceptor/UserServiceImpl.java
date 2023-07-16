package methodInterceptor;

public class UserServiceImpl implements UserService {
    public void show(String name, Double score){
        System.out.println("【UserServiceImpl业务方法执行】name:" + name + "    score:" + score);
    }
}
