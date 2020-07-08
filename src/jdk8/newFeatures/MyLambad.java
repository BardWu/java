package jdk8.newFeatures;

import org.junit.jupiter.api.Test;

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
    //对于一个只有一个抽象方法的抽象类或者接口来说，抽象方法的实现就代表着创建这个类对象
    //匿名内部类：不清楚类的具体名字，只关注其内部方法的实现
    public void test1(){

        //创建对象方式1
        LambadInterface lambadInterface = new LambadInterface() {
            @Override
            public void MyTest(String a) {
                System.out.println(a);
            }
        };

        lambadInterface.MyTest("123");

        //创建对象方式2
        LambadInterface lambadInterface2 = (a)->{
            System.out.println(a);
        };

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



}
