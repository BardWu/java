package jdk8.optionalTest;

import org.junit.Test;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

/**
 * @program: java
 * @description: Optional是Java8提供的为了解决null安全问题的一个API。善用Optional可以使我们代码中很多繁琐、丑陋的设计变得十分优雅。
 *
 * @author: wh
 * @create: 2021-06-24 15:24
 **/
public class OptionalTest1 {

    /**
     * 创建Optional对象
     */
    @Test
    public void test1(){

        Optional<String> empty = Optional.empty();
        //包裹的内容不能为Null
        Optional<String> string = Optional.of("String");
        //包裹的内容可以为Null
        Optional<String> o1 = Optional.ofNullable(null);
    }

    /**
     * 判断空的常用操作
     */
    @Test
    public void test2(){

        Optional<String> string = Optional.of("String");
        string.ifPresent(System.out::println);

        Optional<String> aNull = Optional.ofNullable(null);
        //orElseThrow : 获取值，如果为空，则抛出异常
        String item = aNull.orElseThrow(RuntimeException::new);
        System.out.println(item);
        //orElse : 获取值，如果为空，赋予新值
        String item1 = aNull.orElse("item");
        //orElseGet : 获取值，如果为空，另外一种方法赋予新值
        String item2 = aNull.orElseGet(() -> { return "item1"; });

    }

    /**
     *filter 和 map使用
     */
    @Test
    public void test3(){

        Optional<String> string = Optional.of("String");
        string.filter((x)->x.equals("string")).ifPresent(System.out::println);

        Optional<Person> person = Optional.of(new Person());
        System.out.println(person.map(p -> p.name).orElse("张三"));

        Optional<Person> person2 = Optional.of(new Person("李四"));
        person2.map(p -> p.name).ifPresent(System.out::println);
    }

    class Person{

        String name ;

        public Person(String name){
            this.name = name;
        }


        public Person(){
        }
    }
}
