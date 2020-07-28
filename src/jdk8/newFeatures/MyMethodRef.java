package jdk8.newFeatures;

import jdk8.newFeatures.example.Employee;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.*;

/**
 * @program: java
 * @description: 方法引用
 *  1.若Lambda体中的内容 有方法已经实现了，我们使用“方法引用”
 *  2.方法引用代替Lambda表达式
 *  3.注意点是已经实现方法的参数和返回值，要和Lambda的方法体（接口的抽象方法）一致
 * @author: wh
 * @create: 2020-07-14 20:28
 */
public class MyMethodRef {
    //1.实例：：实例方法名
    @Test
    public void test1(){
        Consumer<String> consumer = (x)->{
            System.out.println(x);
        };
        consumer = (x)->System.out.println(x);

        PrintStream ps = System.out;
        consumer =System.out::println;
    }
    //2.类：：静态方法名
    @Test
    public void test12(){
        Comparator<Integer> comparator = (x,y)->Integer.compare(x,y);
        //类调用静态方法
        comparator = Integer::compare;
        //类调用实例方法
        comparator = Integer::compareTo;
    }
    //3.类：：实例方法名
    //若Lambda参数列表中的第一个参数是实例方法的调用者，而第二个参数是实例方法的参数时，可以使用类名::实例方法
    @Test
    public void test3(){
        BiPredicate<String,String> predicate = (x,y)->x.equals(y);

        predicate = String::equals;
    }
    /*
        构造器引用
    构造器引用可以替代Lambda表达式
    匹配的构造器参数类型和实现该接口（函数式接口）抽象方法的参数类型一致。
      根据抽象方法的参数类型决定调用哪一个构造器
     */
    public void test4(){
        Supplier<Employee> supplier = ()->new Employee();
        supplier = Employee::new;
    }

    /**
     * 数组引用:
     * 构造器引用可以替代Lambda表达式
     *  匹配的构造器参数类型和实现该接口（函数式接口）抽象方法的参数类型一致。
     */
    @Test
    public void test5(){
        Function<Integer,String[]> function = (x)->new String[x];

        function = String[]::new;

        System.out.println(function.apply(10).length);// 10
    }

}
