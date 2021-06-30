package jdk8.streamTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: java
 * @description: stream 中 reduce 和 map的使用
 * @author: wh
 * @create: 2021-06-24 10:33
 **/
public class TestStream2 {

    public static List<String> list;

    static {
        list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
    }

    /**
     * Map的操作
     */
    @Test
    public void test1(){
        //1.创建stream
        Stream<String> stream = list.stream();

        //2.中间操作 -> Map
        Function<String, String> function = new Function<String, String>() {
            //map操作体现于如下:
            @Override
            public String apply(String s) {
                return s+"1";
            }
        };
        List<String> collect =  stream.map((x)->{return  x+"1";}).collect(Collectors.toList());
        collect.forEach(System.out::println);

    }

    /**
     * reduce 减少,叠加器
     * reduce 第一种用法
     */
    @Test
    public void test2(){
        //1.创建stream
        Stream<String> stream = list.stream();
        //reduce 第一种用法
        BinaryOperator<String> biFunction = new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                System.out.println("s:"+s);
                System.out.println("s2:"+s2);
                System.out.println("----------------------");
                return s+s2;
            }
        };

        stream.reduce((x,y)->{
            System.out.println("x:"+x);
            System.out.println("y:"+y);
            System.out.println("----------------------");
            return x+y;
        }).ifPresent(System.out::println);

        /*x:a
        y:b
                ----------------------
        x:ab
        y:c
                ----------------------
        abc*/

        //每一次执行的结果作为下一次操作的第一个参数
    }

    /**
     * 提供一个初始值进行叠加
     * reduce 第二种用法
     */
    @Test
    public void test3(){
        //1.创建stream
        Stream<String> stream = list.stream();
        //reduce 第二种用法
        BinaryOperator<String> biFunction = new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return s+s2;
            }
        };
        System.out.println(stream.reduce("1", biFunction));

    }

    /**
     * reduce 第三种用法
     */
    @Test
    public void test4(){
        //1.创建stream
        Stream<String> stream = list.stream();

         BiFunction<String,String,String> biFunction = new BiFunction<String, String, String>() {
             @Override
             public String apply(String s, String s2) {
                 return s+s2;
             }
         };
        BinaryOperator<String> binaryOperator = new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return s2;
            }
        };
        /**
         * 第三个参数（binaryOperator）定义的规则并没有执行。这是因为reduce的第三个参数是在使用parallelStream的reduce操作时，合并各个流结果的，
         */
        System.out.println(stream.reduce("1",biFunction,binaryOperator));

    }
    /**
     * reduce 第三种用法
     */
    @Test
    public void test5(){
        //1.创建stream
        Stream<Integer> stream = Stream.of(1,2,3,4);
        //reduce 第二种用法

        System.out.println(stream.reduce(new ArrayList<Integer>(), new BiFunction<ArrayList<Integer>, Integer, ArrayList<Integer>>() {
            @Override
            public ArrayList<Integer> apply(ArrayList<Integer> integers, Integer integer) {
                System.out.println("------- BiFunction -------");
                integers.forEach(System.out::println);
                System.out.println("integer:"+integer);
                integers.add(integer);
                return integers;
            }
        }, new BinaryOperator<ArrayList<Integer>>() {
            @Override
            public ArrayList<Integer> apply(ArrayList<Integer> integers, ArrayList<Integer> integers2) {
                System.out.println("------- BinaryOperator -------");
                integers.addAll(integers2);
                return integers;
            }
        }));

    }

    /**
     * reduce 三种方法总结:
     *
     *1. Optional<T> reduce(BinaryOperator<T> accumulator);
     *2.  T reduce(T identity, BinaryOperator<T> accumulator);
     *3.  <U> U reduce(U identity,
     *                  BiFunction<U, ? super T, U> accumulator,
     *                  BinaryOperator<U> combiner);
     *
     *
     * 这三种都是对stream流中的数据进行计算，汇总。
     * 1、2两种方法中参数类型、方法返回值类型都和stream流中一致
     * 第3种,抛开第三个并发处理参数,，方法表示将stream中 ? super T 的参数经过方法计算得出U的类型
     */
}
