package myLang.datastuct.ArrayList;

import jdk.management.resource.internal.inst.InitInstrumentation;
import org.junit.Test;

import java.util.*;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-09-27 17:10
 **/
public class MyArrayList extends ArrayList {

    private ArrayList arrayList;

    @Test
    public void test(){
        //默认创建的数组 大小为0
        ArrayList arrayList  = new ArrayList();
        System.out.println(arrayList.size());
        arrayList.add(1);
        System.out.println(arrayList.size());


        ArrayList arrayList2  = new ArrayList(1);
        System.out.println(arrayList2.size());
        arrayList2.add(1);
        System.out.println(arrayList2.size());
    }
    @Test
    public void test2(){
        int oldCapacity = 1;
        int newCapacity = (oldCapacity >> 1);

        System.out.println(newCapacity);
        //    0 0 0 0   1 1 1  1    15
        //    0 0 0 0   0 1 1  1    7

        //   0 0 0 0    0 1 1 0    6
        //   0 0 0 0    1 1 0 0


    }
    @Test
    public void test3(){
             final ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);

        Iterator iterator = arrayList.iterator();
       System.out.println("t0 -->"+String.valueOf(iterator.next()));
        iterator.remove();
       // iterator.remove();
        while (iterator.hasNext()){
            System.out.println("t1 -->"+String.valueOf(iterator.next()));

        }

        iterator = arrayList.iterator();
      //  System.out.println("t0 -->"+String.valueOf(iterator.next()));
        //      iterator.remove();
        // iterator.remove();
        while (iterator.hasNext()){
            System.out.println("t3 -->"+String.valueOf(iterator.next()));

        }
    }


    public static void main(String[] args) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()){
                    System.out.println("t1 -->"+String.valueOf(iterator.next()));
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        });

        t.start();;

        Thread t2 = new Thread(new Runnable() {
            int i =0;
            @Override
            public void run() {
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()){
                    System.out.println("t2 -->"+String.valueOf(iterator.next()));
                    if(i == 0){
                        arrayList.add(5);
                        i++;
                    }
                }

            }
        });
        t2.start();
    }







    @Test
    public void test4(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Iterator iterator = arrayList.iterator();
        System.out.println(iterator.next());
        iterator.forEachRemaining(System.out::println);

        while (iterator.hasNext()){
            System.out.println("t3 -->"+String.valueOf(iterator.next()));

        }


        iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println("t4 -->"+String.valueOf(iterator.next()));

        }

    }

    @Test
    public void test5(){
        List<String> list = new ArrayList<String>();
        //CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        list.add("a");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String str = (String) iterator.next();
            iterator.remove();
        }

        System.out.println(list);
    }

    @Test
    public void test6(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator<String> iterator = list.iterator();

        System.out.println(iterator.next());
        iterator.remove();

        System.out.println(list);
    }

    @Test
    public void test7(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        ListIterator<String> stringListIterator = list.listIterator();
       /* System.out.println(stringListIterator.next());
        System.out.println(stringListIterator.next());*/
        System.out.println(stringListIterator.next());
        System.out.println(stringListIterator.previous());
        System.out.println(stringListIterator.next());

    }

}
