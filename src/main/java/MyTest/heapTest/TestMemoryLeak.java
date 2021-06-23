package MyTest.heapTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-03-30 15:24
 **/
public class TestMemoryLeak {

    private static int i = 10_000_000;

    private  Object[] elementData;
    private int number =  0;

    public TestMemoryLeak(){
        elementData = new Object[10];
    }

    public void add(Object obj){
        elementData[number++] = obj;
    }

    public  void clear(){
        elementData = null;
        number = 0;
    }

    public static void main(String[] args) {
        test2();
    }

    static void test1(){
        Byte [] bytes ;

        TestMemoryLeak list = new TestMemoryLeak();

        for(int i= 0; i<10; i++){
            bytes = new Byte[i];
            list.add(bytes);
        }
        System.out.println("数据存储");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.clear();
        System.out.println("数据clear");
        System.gc();
        System.out.println("数据gc");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void test2(){
        Byte [] bytes ;

        List<Byte[]> list = new ArrayList<>();

        for(int i= 0; i<10; i++){
            bytes = new Byte[i];
            list.add(bytes);
        }
        System.out.println("数据存储");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.clear();
        System.out.println(" list.clear()");
        System.gc();
        System.out.println("数据gc");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
