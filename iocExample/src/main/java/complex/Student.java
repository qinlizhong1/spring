package complex;

import java.util.*;

class Dog{
    private String dogName;
    private String dogColor;

    public Dog() {
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
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
}

public class Student {
    private String stuName;
    private String stuSex;
    private Integer stuAge;
    private Dog stuDog;

    private String[] arrays;
    private List<Dog> listDogs;
    private Set<String> stringSets;
    private Map<String, Dog> mapDogs;
    private Properties properties;

    //setter注入先调用对应类的无参构造函数
    public Student() {
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

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setListDogs(List<Dog> listDogs) {
        this.listDogs = listDogs;
    }

    public void setStringSets(Set<String> stringSets) {
        this.stringSets = stringSets;
    }

    public void setMapDogs(Map<String, Dog> mapDogs) {
        this.mapDogs = mapDogs;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", stuDog=" + stuDog +
                ", arrays=" + Arrays.toString(arrays) +
                ", listDogs=" + listDogs +
                ", stringSets=" + stringSets +
                ", mapDogs=" + mapDogs +
                ", properties=" + properties +
                '}';
    }
}
