package jdk8.newFeatures.myStream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: java
 * @description: stream 终止操作
 * @author: wh
 * @create: 2020-07-28 20:57
 */
public class MyStop {
    List<String> strings = Arrays.asList("1","2","3","4");
    @Test
     void testMap(){

        List<Integer> integers = strings.stream().map(x->{
            return Integer.parseInt(x);
        }).collect(Collectors.toList());

       Stream<Integer> s =  strings.stream().map(x->{
            return Integer.parseInt(x);
        });

        integers = strings.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

    @Test
     void testMatch(){
        /**
         * allMatch -- 待检测的所有元素是否都匹配
         * anyMatch -- 待检测的所有元素是否至少匹配一个
         * noneMatch -- 待检测的所有元素是否都不匹配
         */
        boolean result = strings.stream().noneMatch(x->{
            if("1".equals(x)){
                return  true;
            }
            return false;
        });
        System.out.println(result);
    }
    @Test
    public void testOther(){
     //   strings = new ArrayList<>();
       String i =  strings.stream().findFirst().orElse("1");

        System.out.println(i);
    }

    /**
     * 最终将流缩减为一个值的终端操作
     */
    @Test
    public void testReduce(){
        List<Integer> list = Arrays.asList(1,2,3,4);
        MyStop myStop = new MyStop();
        Optional<Integer> sum = list.stream().reduce(myStop::apply);
        System.out.println(sum.get());

        int sum2 = list.stream().reduce(1,myStop::apply);
        System.out.println(sum2);

       // list.stream().reduce();
    }

    public  int apply(int  t, int  u){
        return t+u;
    }


    static Stream<Character> getStringCharacterStream(String str){
        List<Character> characters =  new ArrayList<>();

        for(Character c: str.toCharArray()){
            characters.add(c);
        }
        return characters.stream();
    }

    @Test
    void testFlatMap(){
        List<String> list = Arrays.asList("abc","def");
        //flatMap与map有所区别，将多个Stream连接成一个Stream
        Stream<Stream<Character>> list1 = list.stream().map(x->{
           return getStringCharacterStream(x);
        });
        Stream<Character>list2 =  list.stream().flatMap(x->{
            return getStringCharacterStream(x);
        });
    }
}
