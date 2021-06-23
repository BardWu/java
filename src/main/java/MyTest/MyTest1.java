package MyTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-03-10 16:49
 **/
public class MyTest1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        String[] vinArr =  list.toArray(new String[0]);

        AtomicInteger atomicInteger  = new AtomicInteger();
        atomicInteger.incrementAndGet();
    }

    @Test
    public void test1(){
        String c = "ab";
        String a = new String ("a")+new String("b");
        System.out.println(a == a.intern());
    }
}
