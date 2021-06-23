package juc.testCommonObject;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-05-21 09:07
 **/
public class TestObjects {

    public static void main(String[] args) {

    }


    @Test
    public void test1(){

        CountDownLatch countDownLatch = new CountDownLatch(5);


        for(int i=0; i<5 ;i++){
            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" countdown");
                countDownLatch.countDown();
            }).start();

        }
        System.out.println(Thread.currentThread().getName()+" await");

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" await over");

    }

    @Test
    public void test2(){

     /*   CyclicBarrier cyclicBarrier = new CyclicBarrier(2, () -> {
            System.out.println("该我执行了");
        });*/

        CyclicBarrier cyclicBarrier = new CyclicBarrier(2,()->{
            System.out.println("5个线程已经执行,该我了");
        });

        for(int i=0; i<2 ;i++){
            new Thread(()->{
                try {
                    System.out.println(Thread.currentThread().getName()+" await");
                //   TimeUnit.SECONDS.sleep(2);
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName()+" await over");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }).start();

        }


    }


    void test3(){
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
    }

}
