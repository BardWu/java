package juc.testLock;

import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-05-12 09:18
 **/
public class TestLockInterruptibly {

    @Test
    public void test1(){

        Thread.currentThread().interrupt();
        Lock lock = new ReentrantLock();
        try {
            lock.lockInterruptibly();
            TimeUnit.SECONDS.sleep(2);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
    @Test
    public void test2(){



    }
}
