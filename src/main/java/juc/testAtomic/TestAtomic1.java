package juc.testAtomic;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-04-22 13:48
 **/
public class TestAtomic1 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(1,2));
        System.out.println(atomicInteger.get());
    }

    @Test
    public void  test1(){
        AtomicStampedReference<Integer> reference = new AtomicStampedReference<>(1, 1);
        reference.compareAndSet(1,2,1,2);
        System.out.println(reference.getReference()+","+reference.getStamp());


        ReentrantLock reentrantLock = new ReentrantLock();

    }
}
