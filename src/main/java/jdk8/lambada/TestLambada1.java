package jdk8.lambada;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @program: java
 * @description: Lambda表达式可以理解成一个接口的实现,接口只能有一个抽象方法，Lambda表达式实现的是那个抽象方法
 *              ()表示抽象方法存放形参的括号，{}表示抽象方法具体实现的内容
 * @author: wh
 * @create: 2021-06-23 15:50
 **/
public class TestLambada1 {

    @Test
    public void test1(){

        Thread thread = new Thread(()->{
            System.out.println(123);
        });
        thread.start();

    }

    @Test
    public void test2(){
        int num = 10;

        Consumer<String> consumer = ele -> {
            System.out.println(num);
        };

     //   consumer.accept("hello");

    }

    @Test
    public void test3(){


    }

}
