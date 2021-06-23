package juc.testBlockingQueue;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @program: java
 * @description: 1.了解阻塞队列的含义功能。2：多种不同类型的方法
 * @author: wh
 * @create: 2021-04-26 09:52
 **/
public class TestQueue1 {

    /**
     * add remove 超出范围，报错
     */
    @Test
    public void test1(){
        BlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        blockingQueue.add(1);
        blockingQueue.add(2);
        blockingQueue.add(3);

        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
    }

    /**
     * offer peek 超出范围，不报错
     */
    @Test
    public void test2(){
        BlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        blockingQueue.offer(1);
        blockingQueue.offer(2);
        blockingQueue.offer(3);
        blockingQueue.offer(4);

        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.peek());
    }

    /**
     * put take 超出阻塞，
     */
    @Test
    public void test3(){
        BlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        try {
            blockingQueue.put(1);
            blockingQueue.put(2);
            blockingQueue.put(3);
            //blockingQueue.put(4);

            System.out.println(blockingQueue.take());
            System.out.println(blockingQueue.take());
            System.out.println(blockingQueue.take());
            System.out.println(blockingQueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
