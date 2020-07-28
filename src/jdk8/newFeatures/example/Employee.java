package jdk8.newFeatures.example;

/**
 * @program: java
 * @description: 员工表
 * @author: wh
 * @create: 2020-07-09 21:01
 */
public class Employee {
    private int age;

    private int money;

    public Employee(int age, int money) {
        this.age = age;
        this.money = money;
    }

    public Employee(int age) {
        this.age = age;
    }

    public Employee() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", money=" + money +
                '}';
    }
}
