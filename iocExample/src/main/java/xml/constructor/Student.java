package xml.constructor;

class Dog{
    private String dogName;
    private String dogColor;

    public Dog(String dogName, String dogColor) {
        this.dogName = dogName;
        this.dogColor = dogColor;
        System.out.println("Dog全参构造函数被调用");
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

    public Student(String stuName, String stuSex, Integer stuAge, Dog stuDog) {
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.stuDog = stuDog;

        System.out.println("Student全参构造函数被调用");
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
