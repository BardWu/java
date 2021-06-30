package fanxing.Mysuper;

import fanxing.extend.MyPair;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: java
 * @description: 泛型 下界通配符<? super T>
 * @author: wh
 * @create: 2021-06-25 16:48
 **/
public class MySuper<T> {

    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    /**
     * 传入的类型T是固定的某一种
     * @param p
     */
    void add(MySuper<T> p) {
        // ...
    }

    /**
     *传入的类型T是其本身或者其父类
     * @param p
     */
    void add2(MySuper< ? super T> p) {
        // ...
    }

    @Test
    public void test1(){

        MySuper<Integer> mySuper =new MySuper<>();
        MySuper<Number> mySuper2 =new MySuper<>();

        mySuper.add2(mySuper2);
     //   mySuper2.add2(mySuper); error

    }

    @Test
    public void test2(){

        List<? super Integer> list = Arrays.asList(1,2,3);

        int number = 0;
        for (int i=0; i<list.size(); i++) {
            // list.set(i,0); error
            Object object = list.get(i); //由于Object是Integer最大父类，所以来进行获取
            list.set(i,1);//由于向上兼容，所以可以设置最小子类类型的值
            number += Integer.parseInt(String.valueOf(object));
        }
        System.out.println(number);
        list.forEach(System.out::println);
    }
}
