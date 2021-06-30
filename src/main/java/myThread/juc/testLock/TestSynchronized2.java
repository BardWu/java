package myThread.juc.testLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-05-06 09:39
 **/
public class TestSynchronized2 {

    public static void main(String[] args)throws Exception {

        Syn2 syn2 = new Syn2();
        new Thread(()->{
                syn2.printfA();

        }).start();
        TimeUnit.SECONDS.sleep(2);

        new Thread(()->{
                syn2.printfB();

        }).start();
    }

}

class Syn2{


    synchronized  void  printfA(){

        System.out.println(Thread.currentThread().getName()+" wait ...");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" awake ...");
    }


    synchronized  void  printfB(){

        System.out.println(Thread.currentThread().getName()+" notify ...");
        this.notify();
        System.out.println(Thread.currentThread().getName()+" aready notify  ...");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+" aready notify END  ...");
    }
}

class Syn3{

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

      void  printfA(){
        lock.lock();
        try {
          System.out.println(Thread.currentThread().getName()+" wait ...");
          condition.await();
          System.out.println(Thread.currentThread().getName()+" awake ...");
         } catch (InterruptedException e) {
          e.printStackTrace();
         }finally {
            lock.unlock();
      }
      }


      void  printfB(){
          lock.lock();
          try {
              System.out.println(Thread.currentThread().getName()+" notify ...");
              condition.signal();
              System.out.println(Thread.currentThread().getName()+" aready notify  ...");
              TimeUnit.SECONDS.sleep(4);

              System.out.println(Thread.currentThread().getName()+" aready notify END  ...");
          } catch (InterruptedException e) {
              e.printStackTrace();
          } finally {
              lock.unlock();
          }
      }
}