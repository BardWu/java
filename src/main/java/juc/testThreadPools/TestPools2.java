package juc.testThreadPools;

import org.junit.Test;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-04-26 11:13
 **/
public class TestPools2 {


    @Test
    public void test1(){


        new ThreadPoolExecutor.DiscardPolicy();
        new ThreadPoolExecutor.AbortPolicy();
        new ThreadPoolExecutor.CallerRunsPolicy();
        new ThreadPoolExecutor.DiscardOldestPolicy();


        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,
                5,
                2,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy());

        for(int i=0; i< 10;i++){
            final  int temp = i;
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            threadPoolExecutor.execute(()->{

                System.out.println(Thread.currentThread().getName()+" execute "+temp);

            });
        }

    }

    @Test
    public void test2(){
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    @Test
    public void test3(){
        System.out.println(2<<2);
        System.out.println(2<<3);
        System.out.println(128+62+32+16+8+4);
    }
}
