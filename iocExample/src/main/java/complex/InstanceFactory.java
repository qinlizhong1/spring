package complex;
//通过实例工厂方式创建复杂对象
public class InstanceFactory {
    public  Cat getInstance(){
        return new Cat("小猫3号", 30);
    }
}
