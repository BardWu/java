package jdk8.newFeatures.myStream;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-07-21 21:40
 */
public class MyTestObject {

    private int age;

    private String name;

    public MyTestObject(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyTestObject{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
