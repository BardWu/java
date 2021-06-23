package juc.testCommonObject;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-04-25 17:25
 **/
public class TestCyclicBarrierDemo {

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(5,()->{
            System.out.println("5个线程已经执行,该我了");
        });

        for(int i = 0; i<5; i++){
            final int temp = i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"执行了");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            },""+i).start();
        }
    }
}
