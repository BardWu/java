package juc.dataStruct;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-04-22 15:18
 **/
public class TestArrayList {

    public static void main(String[] args) {

    }

    @Test
    public void testArrayList(){
        List<String> objects = new ArrayList<>();

        for(int i = 0; i<50;i++){
            new Thread(()->{
                for(int j = 0; j<5; j++){
                    objects.add(Thread.currentThread().getName()+j);
                }
                System.out.println(objects);
            }).start();
        }
    }


    @Test
    public void testVector(){
        Vector<String> objects = new Vector<>();

        for(int i = 0; i<50;i++){
            new Thread(()->{
                for(int j = 0; j<5; j++){
                    objects.add(Thread.currentThread().getName()+j);
                    objects.get(j);
                }
                System.out.println(objects);
            }).start();
        }
    }
    @Test
    public void testCollectionsList() {

        List<String> objects = Collections.synchronizedList(new ArrayList<>());

        for(int i = 0; i<50;i++){
            new Thread(()->{
                for(int j = 0; j<5; j++){
                    objects.add(Thread.currentThread().getName()+j);
                }
                System.out.println(objects);
            }).start();
        }

    }

    @Test
    public void testCopyOnWriteArrayList() {

        List<String> objects = new CopyOnWriteArrayList<>();

        for(int i = 0; i<50;i++){
            new Thread(()->{
                for(int j = 0; j<5; j++){
                    objects.add(Thread.currentThread().getName()+j);
                }
                System.out.println(objects);
            }).start();
        }

    }
}