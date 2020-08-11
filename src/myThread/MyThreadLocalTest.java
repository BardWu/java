package myThread;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-08-07 11:38
 **/
public class MyThreadLocalTest {

    @Test
   void test1(){
       ThreadLocal<String> threadLocal = new ThreadLocal<>();
        ThreadLocal<String> threadLocal2 = new ThreadLocal<>();

        threadLocal.set(" main thread");
        threadLocal2.set(" main thread2");





       System.out.println("threadLocal.get():"+threadLocal.get());
        System.out.println("threadLocal2.get():"+threadLocal2.get());



        Thread thread = new Thread(()-> {
            System.out.println(Thread.currentThread().getName()+":Thread");
            threadLocal.set("thread");
        });

        Thread thread2 = new Thread(()-> {
            System.out.println(Thread.currentThread().getName()+":Thread1");
            threadLocal.set("thread1");
        });
   }

   @Test
   void test3(){
      List<String> a = new ArrayList<>();
      a.add("1");
      a.add("2");
       for (String temp:a) {
           if("2".equals(temp)){
               a.remove(temp);
           }
       }
       System.out.println(a);
   }
}
