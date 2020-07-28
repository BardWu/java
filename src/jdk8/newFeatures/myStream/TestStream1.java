package jdk8.newFeatures.myStream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-07-21 21:39
 */
public class TestStream1 {



    /**
     * Stream的操作步骤：
     *  1:创建Stream流
     *  2:流的一系列中间操作
     *  3:终止操作
     */
    //创建操作
    @Test
    public void test1(){
        //1.通过Collection系列提供的Stream()
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        //2.通过Arrays提供的静态方法
        String[] strings = new String[10];
        Stream<String> stringStream = Arrays.stream(strings);

        //3.通过Stream提供的静态方法
        Stream<String> of = Stream.of("a","b","c");
    }
    //中间操作
    @Test
    public void test2(){
        List<MyTestObject> myTestObjects = new ArrayList<>();
        MyTestObject myTestObject = new MyTestObject(1,"张三");
        myTestObjects.add(myTestObject);
        myTestObject = new MyTestObject(2,"李四");
        myTestObjects.add(myTestObject);
        myTestObject = new MyTestObject(3,"王五");
        myTestObjects.add(myTestObject);

        Predicate<MyTestObject> predicate = x->{
          if(x.getAge()<3){
              return true;
          }
          return false;
        };
        //中间操作：
        Stream<MyTestObject> objectsStream  = myTestObjects.stream()
                .filter(predicate);

        //终止操作
        objectsStream.forEach(System.out::println);

    }

    public void test4(){
        List<MyTestObject> myTestObjects = new ArrayList<>();
        MyTestObject myTestObject = new MyTestObject(1,"张三");
        myTestObjects.add(myTestObject);
        myTestObject = new MyTestObject(2,"李四");
        myTestObjects.add(myTestObject);
        myTestObject = new MyTestObject(3,"王五");
        myTestObjects.add(myTestObject);


        //中间操作：
        Stream<MyTestObject> objectsStream  = myTestObjects.stream()
                .skip()

        //终止操作
        objectsStream.forEach(System.out::println);


    }



}
