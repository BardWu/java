package jdk8.newFeatures;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-07-24 17:02
 **/
public class MyStreamTest {


    /**
     * limit
     */
    @Test
    public void test1(){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //1.创建stream
        Stream<Integer> integerStream = list.stream();
        //2.经过一系列的中间操作
        integerStream = integerStream.limit(3);
        //3.终止操作
      /*  integerStream.forEach((x)->{
            System.out.println(x);
        });*/
      // integerStream.forEach(x-> System.out.println(x));

      //  integerStream.forEach(System.out::println);
    }

    /**
     * filter
     */
    @Test
    public void test2(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        MyStreamTest myStreamTest = new MyStreamTest();
        //1.创建stream
        Stream<Integer> integerStream = list.stream();
        //2.中间操作
        integerStream = integerStream.filter(myStreamTest::test);
        //终止
        integerStream.forEach(System.out::println);
    }

    public boolean test(int i){
        boolean result = i>3?true:false;
        return result;
    }

    /**
     * distinct
     */
    @Test
    public void test3(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        MyStreamTest myStreamTest = new MyStreamTest();
        //1.创建stream
        Stream<Integer> integerStream = list.stream();
        //2.中间操作
        integerStream = integerStream.distinct();
        //终止
        integerStream.forEach(System.out::println);
    }

    /**
     * map
     */
    @Test
    public void test4(){
        MyStreamTest myStreamTest = new MyStreamTest();

        Function<Integer,Integer> function = (x)->{return ++x;};


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);

        //1.创建stream

        Stream<Integer> integerStream = list.stream().map(x->{
            return ++x;
        });

        // Stream<Integer> integerStream = list.stream().map(function);

        // Stream<Integer> integerStream = list.stream().map(myStreamTest::test2);

        //终止
        integerStream.forEach(System.out::println);
    }

    public int test2(int i){
       return ++i;
    }


    /**
     * sorted
     */
    @Test
    public void test5(){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(5);
   //     list.stream().sorted().forEach(System.out::println);

        Comparator<Integer>comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-02;
            }
        };

        list.stream().sorted(comparator).forEach(System.out::println);
    }

    /**
     * todo
     * Collectors
     */
    @Test
    public void test6(){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(5);

     //   Collector<String,Integer, Integer> collector =

        list.stream().collect(Collectors.toList());
    }
}
