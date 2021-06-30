package jdk8.lambada;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: java
 * @description: 修饰函数式接口的，要求接口中的抽象方法只有一个。 这个注解往往会和 lambda 表达式一起出现。
 *               被 default 修饰的方法会有默认实现，不是必须被实现的方法，所以不影响 Lambda 表达式的使用。
 * @author: wh
 * @create: 2021-06-23 16:07
 **/
@FunctionalInterface
public interface TestFunctionInterface {

    default void test1(){
         System.out.println(233);
    }

    int test2();

    @Override
    boolean equals(Object obj);



    public static void main(String[] args) {
        //使用一：lambada接口的实现
        TestFunctionInterface test = ()->2;
        System.out.println(test.test2());

        //使用二：可以使用其它已经被实现的方法
        //方法归属者::方法名 静态方法的归属者为类名，普通方法归属者为对象
        test = TestFunctionInterface2::test3;

        //练习一
        List<Integer> integers = Arrays.asList(1, 2, 3);
        /**
         * default void forEach(Consumer<? super T> action)
         *  lambada对接口实现的体现
         */
        integers.forEach(x-> System.out.println(x));
        integers.forEach(System.out::println);


    }

    class TestFunctionInterface2{

        static int test3(){
            return 3;
        }
    }
}
