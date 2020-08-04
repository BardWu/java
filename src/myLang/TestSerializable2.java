package myLang;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-08-04 14:47
 **/
public class TestSerializable2 implements Serializable {

    static final long serialVersionUID = 1L;



    private String age;

    private int sex;




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
        return "TestSerializable2{" +
                "age='" + age + '\'' +
                ", sex=" + sex +
                '}';
    }

    //测试序列化和反序列化
    public static void main(String[] args)throws Exception {
        TestSerializable2 t = new TestSerializable2();
        t.setAge("1");
     //   t.setName("2");
        String url = "C:\\Users\\BardWu\\Desktop\\0bject.txt";
      /*  ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(url));

        o.writeObject(t);

        o.close();
*/

        ObjectInputStream i = new ObjectInputStream(new FileInputStream(url));

        TestSerializable2 t2 = (TestSerializable2)i.readObject();
        System.out.println(t2);
    }
}
