package jdk8.newFeatures.MyOptional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-07-31 16:29
 **/
public class Test1 {

    //创建对象
    @Test
    void test1(){
        Optional<String> o1 = Optional.empty();
        Optional<String> o2 = Optional.ofNullable(null);

        Optional<Integer> o3 = Optional.ofNullable(null);
        Optional<Integer> o4 = Optional.ofNullable(null);
        System.out.println(o1 == o2);
        System.out.println(o3 == o4);
        Integer i = null;
        Integer b = null;

    }

}
