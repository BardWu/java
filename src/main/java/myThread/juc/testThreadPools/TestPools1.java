package myThread.juc.testThreadPools;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-04-26 10:35
 **/
public class TestPools1 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newFixedThreadPool(3);
        ExecutorService executorService3 = Executors.newCachedThreadPool();
    }

    @Test
    public void test1(){

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for(int i=0 ;i< 10 ;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" do AAA");
                }
            });
        }


    }

    @Test
    public void test2(){

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0 ;i< 2 ;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" do AAA");
                }
            });
        }


    }

    @Test
    public void test3(){

        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0 ;i< 20 ;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" do AAA");
                }
            });
        }


    }
}
