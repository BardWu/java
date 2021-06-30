package myThread.juc.testCommonObject;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @program: java
 * @description:  信号量
 * @author: wh
 * @create: 2021-04-26 09:22
 **/
public class TestSemaphore {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);
        for(int i=0; i<7;i++){
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+" 执行");
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            },"Thread"+i).start();
        }
    }
}
