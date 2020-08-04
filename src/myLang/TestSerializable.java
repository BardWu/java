package myLang;

import java.io.*;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-08-04 14:47
 **/
public class TestSerializable  implements Serializable {

    static final long serialVersionUID = 1L;

    private String name;

    private String age;

    private int sex;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "TestSerializable{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex=" + sex +
                '}';
    }

    //测试序列化和反序列化
    public static void main(String[] args)throws Exception {
        TestSerializable t = new TestSerializable();
        t.setAge("1");
        t.setName("2");
        t.setSex(1);
        String url = "C:\\Users\\BardWu\\Desktop\\0bject.txt";

        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(url));
        o.writeObject(t);
        o.close();

        ObjectInputStream i = new ObjectInputStream(new FileInputStream(url));
        TestSerializable t2 = (TestSerializable)i.readObject();
        System.out.println(t2);
    }
}
