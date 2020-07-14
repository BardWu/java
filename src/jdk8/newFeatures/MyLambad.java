package jdk8.newFeatures;

import org.junit.jupiter.api.Test;

import java.util.function.*;

/**
 * @program: java
 * @description: lambad Test
 * @author: wh
 * @create: 2020-07-08 16:47
 **/
public class MyLambad {
    //定义: ()->{};由这三个组成，（）表示参数列表，{}表示需要执行的功能
    //（）表示抽象方法的形参括号，{}表示抽象方法的实现。带着这种思想去学习

    @Test
    //对于一个只有一个抽象方法的抽象类或者接口来说，抽象方法的实现就代表着创建这个类对象,也就是说在某种情况下
    //lambda表达式可表示为一个对象
    //匿名内部类：不清楚类的具体名字，只关注其内部方法的实现
    public void test1(){

        //创建对象方式1 ->匿名内部内方式
        LambadInterface lambadInterface = new LambadInterface() {
            @Override
            public void MyTest(String a) {
                System.out.println(a);
            }
        };

        lambadInterface.MyTest("123");

        //创建对象方式2 -> lambda方式
        LambadInterface lambadInterface2 = (String a)-> System.out.println(a);;

        lambadInterface2.MyTest("123");
        // 结果一致
    }
    @Test
    public void test2(){
        Thread thread = new Thread(()->{
            for(int i=0; i<10;i++){
                System.out.println(i);
            }
        });
        thread.start();
    }

    //jdk 提供的四种函数式接口
    @Test
    public void test3(){
        //消费性
        Consumer<String> consumer = (a)->{
            System.out.println("consumer");
        };
        consumer.accept("2");

        //供给性接口:
        Supplier<Object> supplier = ()->{return  new Object();};
        supplier.get();

        //函数性接口
        Function<Integer,String>  function = (i)->{
            if(1==i){
                return new String("a");
            }else{
                return new String("b");
            }
        };
        function.apply(1);
        //判断性
        Predicate<String> predicate = (i)->{
            if("a".equals(i)) {
                return true;
            }

            return false;
        };
    }
    @Test
    public void test4(){
    // String.valueOf();静态方法
    // equals()：实例方法
        Function<Integer,String>  function = (i)->{
            return String.valueOf(i);
        };

        Function<Integer,String>  function2 = String::valueOf;

        System.out.println(function2.apply(1));

       Consumer<String> consumer = (i)->{System.out.println(i);};
       consumer = (i)-> System.out.println(i);
       consumer = System.out::println;


    };



}
