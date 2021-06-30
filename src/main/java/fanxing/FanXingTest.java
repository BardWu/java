package fanxing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-06-28 09:42
 **/
public class FanXingTest {



    public static  void set(List<? extends Integer> list, List<? super Integer> list2){

        for(int i = 0; i<list.size(); i++){
            list2.add(list.get(i));
        }

    };

    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        for (int i=0; i<src.size(); i++) {
            T t = src.get(i); // src是producer
            dest.add(t); // dest是consumer
        }
    }

    public static <T> void copy2(List<T> dest, List< T> src) {
        for (int i=0; i<src.size(); i++) {
            T t = src.get(i);
            dest.add(t);
        }
    }



    @Test
    public void test1(){

        List<Integer> producer = new ArrayList<>();
        producer.add(1);
        producer.add(2);
        producer.add(3);

        List<Integer> consumer = new ArrayList<>();
        consumer.add(4);
        consumer.add(5);
        consumer.add(6);


        FanXingTest.copy(producer,consumer);

        producer.forEach(System.out::println);

        consumer.forEach(System.out::println);

    }

    @Test
    public void test2(){

      //  ArrayList<Integer> list = Arrays.asList(1, 2, 3); // error
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list);
    }

}
