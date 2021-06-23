package juc.testLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java
 * @description: lock 锁的简单使用
 * @author: wh
 * @create: 2021-04-20 19:40
 **/
public class TestLock1 {

    public static void main(String[] args) {

        Node node = new Node();

        new Thread(()->{
            for(int i=0 ;i<20;i++) {
                node.add();
            }
        }).start();


        new Thread(()->{
            for(int i=0 ;i<20;i++) {
                node.desc();
            }
        }).start();




    }

}

class Node{

    int number = 0;
    Lock lock = new ReentrantLock();
    public void add(){
        lock.lock();
        try {
            number++;
            System.out.println(number);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void desc(){
        lock.lock();
        try {
            number--;
            System.out.println(number);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
