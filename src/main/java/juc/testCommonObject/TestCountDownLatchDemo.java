package juc.testCommonObject;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @program: java
 * @description: 减法计数器
 * @author: wh
 * @create: 2021-04-25 17:15
 **/
public class TestCountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException{

        CountDownLatch countDownLatch = new CountDownLatch(1);//需要6个线程

        for(int i = 0;i<3; i++){
            new Thread(()->{//6个线程业务执行完成后，主线程被唤醒
                try {
                    System.out.println(Thread.currentThread().getName()+"await begin"+System.currentTimeMillis());
                    countDownLatch.await();//业务执行完成的标志
                    System.out.println(Thread.currentThread().getName()+"await ok"+System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        //使调用 countDownLatch的线程A阻塞,当countDownLatch线程全部执行完后，线程A被唤醒
        //线程间通信的一种实现
        TimeUnit.SECONDS.sleep(2);
        countDownLatch.countDown();//业务执行完成的标志

        System.out.println("countDown已经执行完成");
    }

}
