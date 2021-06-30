package myThread.juc.testLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java
 * @description:    lock 生产者 消费者
 * @author: wh
 * @create: 2021-04-21 09:50
 **/
public class TestLock2 {

    public static void main(String[] args) {
        NodeNumber2 nodeNumber = new NodeNumber2();

        new Thread(()->{
            for (int i=0; i<20;i++){
                nodeNumber.add();
            }
        }).start();

        new Thread(()->{
            for (int i=0; i<20;i++){
                nodeNumber.res();
            }
        }).start();

        new Thread(()->{
            for (int i=0; i<20;i++){
                nodeNumber.add();
            }
        }).start();


        new Thread(()->{
            for (int i=0; i<20;i++){
                nodeNumber.res();
            }
        }).start();
    }

}

class NodeNumber2{

    private int number;

    Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    public void add(){
        lock.lock();
        try {

            while(number != 0){
                condition1.await();
            }

            //2.执行业务
            number++;
            System.out.println(Thread.currentThread().getName()+" add "+number);

            //3.唤醒
            condition1.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public synchronized void res(){
        lock.lock();
        try {
            while(number == 0){
                condition1.await();
            }
            //2.执行业务
            number--;
            System.out.println(Thread.currentThread().getName()+" res "+number);
            //3.唤醒
            condition1.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
