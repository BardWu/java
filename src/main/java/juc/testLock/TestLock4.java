package juc.testLock;

import java.util.Collections;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java
 * @description: 有序的唤醒
 * @author: wh
 * @create: 2021-04-21 10:28
 **/
public class TestLock4 {

    public static void main(String[] args) {


        NodeNumber3 nodeNumber = new NodeNumber3();

        new Thread(()->{
            for (int i=0; i<30;i++){
                nodeNumber.printA();
            }
        },"threadA").start();


        new Thread(()->{
            for (int i=0; i<20;i++){
                nodeNumber.printc();
            }
        },"threadC").start();

        new Thread(()->{
            for (int i=0; i<20;i++){
                nodeNumber.printB();
            }
        },"threadB").start();





    }

}

class NodeNumber4{

    private int number = 0;

    ReentrantLock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    public void printA() {
        lock.lock();
        try {
            while (number != 0) {
                System.out.println(Thread.currentThread().getName() + " printA await");
                condition1.await();
            }

            //2.执行业务
            number = 1;
            System.out.println(Thread.currentThread().getName() + " printA " + number);

            //3.唤醒
            condition2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printB() {
        lock.lock();
        try {
            while (number != 1) {
                System.out.println(Thread.currentThread().getName() + " printB await");
                condition2.await();
            }

            //2.执行业务
            number = 0;
            System.out.println(Thread.currentThread().getName() + " printB " + number);

            //3.唤醒
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printc() {
        lock.lock();
        try {
            while (number != 1) {
                System.out.println(Thread.currentThread().getName() + " printc await");
                condition3.await();
            }

            //2.执行业务
            number = 0;
            System.out.println(Thread.currentThread().getName() + " printc " + number);

            //3.唤醒
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
