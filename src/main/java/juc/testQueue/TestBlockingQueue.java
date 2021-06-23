package juc.testQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-04-25 20:24
 **/
public class TestBlockingQueue {


    public void test1(){
        BlockingQueue blockingDeque = new ArrayBlockingQueue<>(1);
        BlockingQueue blockingQueue = new LinkedBlockingQueue();
    }
}
