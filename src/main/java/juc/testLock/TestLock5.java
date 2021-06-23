package juc.testLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java
 * @description: lock 锁的原理
 * @author: wh
 * @create: 2021-04-22 14:26
 **/
public class TestLock5 {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {

        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
}
