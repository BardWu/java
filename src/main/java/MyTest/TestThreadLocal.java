package MyTest;

import org.junit.Test;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-05-08 10:51
 **/
public class TestThreadLocal {


    @Test
    public void test(){

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        Thread thread = new Thread(()->{
           threadLocal.set("123");
            System.out.println(Thread.currentThread().getName()+threadLocal.get());
        },"thread-A");

        threadLocal.set("456");
        System.out.println(Thread.currentThread().getName()+threadLocal.get());
    }


}
