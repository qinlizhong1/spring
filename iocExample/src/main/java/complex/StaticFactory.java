package complex;

//通过静态工厂方式创建复杂对象
public class StaticFactory {
    public static Cat getInstance(){
        return new Cat("小猫2号", 20);
    }
}
