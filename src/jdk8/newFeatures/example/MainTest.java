package jdk8.newFeatures.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-07-09 21:02
 */
public class MainTest {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee(20,5000);
        list.add(employee);

        employee = new Employee(25,7000);
        list.add(employee);

        employee = new Employee(35,9000);
        list.add(employee);


        //获取年龄大于等于25的员工

        Predicate<Employee> predicate = (employee1)->{return employee1.getAge()>=25;};

    }
    //普通方式
    static List<Employee> get( List<Employee> list){
        List<Employee> result = new ArrayList<>();
        for (Employee em :list) {
            if(em.getAge()>=25){
                result.add(em);
            }
        }
        return result;
    }

    /**
     *
     * @param list
     * @param opt 一种策略 一种解决问题的思路
     * @return
     */
    static List<Employee> get2( List<Employee> list,EmployeeOpt opt){
        List<Employee> result = new ArrayList<>();
        for (Employee em :list) {
           if(opt.isOpt(em)){
               result.add(em);
           }
        }
        return result;
    }

    static List<Employee> get3( List<Employee> list){
      return   get2(list,(e)->{return e.getAge()>25;});
    }

    @Test
    public void test1(){
        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee(20,5000);
        list.add(employee);

        employee = new Employee(20,7000);
        list.add(employee);
        Collections.sort(list,(a,b) -> a.getAge()-b.getAge()==0?-(a.getMoney()-b.getMoney()):a.getAge()-b.getAge());
        System.out.println(list);

        Function<String,String> function = (i)-> i.toUpperCase();
        System.out.println(function.apply("abc"));
        BiFunction<Integer,Integer,Integer> biFunction = (a,b)-> a*b;
        System.out.println(biFunction.apply(1,5));

        list.forEach((e)-> System.out.println(e));
    }

}
