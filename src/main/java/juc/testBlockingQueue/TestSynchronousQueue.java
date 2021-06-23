package juc.testBlockingQueue;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-04-26 10:03
 **/
public class TestSynchronousQueue {

    public static void main(String[] args) {

        SynchronousQueue synchronousQueue = new SynchronousQueue();

        new Thread(()->{

            try {

                synchronousQueue.put(1);
                System.out.println(Thread.currentThread().getName()+"put 第一次");

                TimeUnit.SECONDS.sleep(2);

                synchronousQueue.put(1);
                System.out.println(Thread.currentThread().getName()+"put 第2次");

                TimeUnit.SECONDS.sleep(2);

                synchronousQueue.put(1);
                System.out.println(Thread.currentThread().getName()+"put 第3次");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{

            try {

                synchronousQueue.take();
                System.out.println(Thread.currentThread().getName()+"take 第一次");


                synchronousQueue.take();
                System.out.println(Thread.currentThread().getName()+"take 第2次");


                synchronousQueue.take();
                System.out.println(Thread.currentThread().getName()+"take 第3次");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


    }
}
