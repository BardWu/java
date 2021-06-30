package jdk8.streamTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-06-23 17:07
 **/
public class TestStream1 {

    @Test
    public void  test1(){

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 56);

        Stream<Integer> limit = integers.stream().limit(1);
        limit.forEach(System.out::println);
        System.out.println("-------------");

        //
        integers.forEach(System.out::println);

    }

    @Test
    public void  test2(){

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 56);

     //  integers.stream().map(i->++i).forEach(System.out::println);

    //    integers.stream().sorted((x,y)->{return -(x-y);}).forEach(System.out::println);

      //lambada 和 stream 流的使用
       /* BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };*/
        integers.stream().reduce((i,j)->0).ifPresent(System.out::println);
    }

}
