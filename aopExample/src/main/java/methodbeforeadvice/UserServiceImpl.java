package methodbeforeadvice;

public class UserServiceImpl implements UserService{
    public void login(String name, String passwd){
        System.out.println(name +  " 登录成功");
    }

    public void logout(){
        System.out.println("已经退出");
    }
}
