package myThread.juc.testLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java
 * @description: lock 生产者 消费者(非按顺序唤醒)
 * @author: wh
 * @create: 2021-04-21 10:05
 **/
public class TestLock3 {

    public static void main(String[] args) {
        NodeNumber3 nodeNumber = new NodeNumber3();

        new Thread(()->{
        for (int i=0; i<20;i++){
            nodeNumber.printA();
        }
         },"thread-A").start();

        new Thread(()->{
        for (int i=0; i<10;i++){
            nodeNumber.printB();
        }
          },"thread-b").start();

        new Thread(()->{
        for (int i=0; i<10;i++){
            nodeNumber.printc();
        }
        },"thread-c").start();



}

}

class NodeNumber3{

    String a;
    private int number;

    Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
  //  Condition condition2 = lock.newCondition();

    public void printA(){
        lock.lock();
        try {
            while(number != 0){
            //    System.out.println(Thread.currentThread().getName()+" printA await");
                condition1.await();
            }

            //2.执行业务
            number = 1;
            System.out.println(Thread.currentThread().getName()+" printA "+number);

            //3.唤醒
            condition1.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printB(){
        lock.lock();
        try {
            while(number != 1){
          //      System.out.println(Thread.currentThread().getName()+" printB await");
                condition1.await();
            }

            //2.执行业务
            number = 0;
            System.out.println(Thread.currentThread().getName()+" printB "+number);

            //3.唤醒
            condition1.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printc(){
        lock.lock();
        try {
            while(number != 1){
        //        System.out.println(Thread.currentThread().getName()+" printc await");
                condition1.await();
            }

            //2.执行业务
            number = 0;
            System.out.println(Thread.currentThread().getName()+" printc "+number);

            //3.唤醒
            condition1.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
