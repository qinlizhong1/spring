package xml.setter;

class Dog{
    private String dogName;
    private String dogColor;

    public Dog() {
        System.out.println("Dog无参构造函数被调用");
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
        System.out.println("setDogName函数被调用");
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
        System.out.println("setDogColor函数被调用");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogColor='" + dogColor + '\'' +
                '}';
    }
}

public class Student {
    private String stuName;
    private String stuSex;
    private Integer stuAge;
    private Dog stuDog;

    //setter注入先调用对应类的无参构造函数
    public Student() {
        System.out.println("Student无参构造函数被调用");
    }

    //再调用对应setter方法设置属性
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public void setStuDog(Dog stuDog) {
        this.stuDog = stuDog;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", stuDog=" + stuDog +
                '}';
    }
}
