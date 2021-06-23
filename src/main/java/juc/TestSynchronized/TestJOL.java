package juc.TestSynchronized;

import org.openjdk.jol.info.ClassLayout;

/**
 * @program: java
 * @description: JAVA Object Layout
 * @author: wh
 * @create: 2021-04-13 19:14
 **/
public class TestJOL {

    public static void main(String[] args) throws Exception{

    //    Thread.sleep(5000);

        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());



        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }

  /*      //程序目的是 加 1操作
        AtomicInteger atomicInteger = new AtomicInteger(1);
        System.out.println(atomicInteger.incrementAndGet()); //  2*/
    }
}
