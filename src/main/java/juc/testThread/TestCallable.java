package juc.testThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-04-25 16:54
 **/
public class TestCallable {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //实例化Callable对象
        Callable<String> objectCallable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("aaa");
                return "aa";
            }
        };
        //创建futureTask对象
        FutureTask<String> futureTask = new FutureTask<>(objectCallable);
        //启动线程
        new Thread(futureTask).start();
        //获取返回值
        System.out.println(futureTask.get());
    }

}

