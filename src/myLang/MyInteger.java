package myLang;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-08-03 13:57
 **/
public class MyInteger {
    /**
     * 1.内部类
     * 2.assert短语
     * 3.-127 128 缓存
     */

    /**
     * 最大最小值
     */
    @Test
    void test1(){
        System.out.println("Integer.MAX_VALUE(01111111111111111111111111111111):"+Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE(10000000000000000000000000000000):"+Integer.MIN_VALUE);
    }

    /**
     * 缓存
     */
    @Test
    void test2(){

        Integer i = new Integer(2);
        Integer b = new Integer(2);

        //自动拆箱 和自动装箱

        //自动装箱 相当于调用 Integer的valueOf()函数
        Integer a = -128;
        Integer c = -128;
        System.out.println( i==b);
        System.out.println( a==c);

        Integer m = 1;
        //自动拆箱 调用了intValue()函数
        /**
         *  public int intValue() {
         *         return value;
         *     }
         */

        int n = m;
        // 包装类和基本类型进行运算时,隐式自动拆箱
        System.out.println( m==n);
    }

    /**
     * Integer 缓存（自动装箱）
     *  Integer i=2 调用Integer.ValueOf(涉及到缓存, Integer 可以通过参数改变最大值的范围，)
     */
    @Test
    void test3(){
        int max = 127;
        int min = -128;

        int cacheId = min;
        // length 257
        Integer[]cache = new Integer[max-min+1];

        for(int k = 0; k < cache.length; k++){
            cache[k] = new Integer(cacheId++);
        }
        // -128 到 127
        Arrays.stream(cache).forEach(System.out::println);

        int i= 1;
        //-> 1
        System.out.println(cache[i + (-min)]);
    }

    void test4(){
        Integer value =2;
        Integer obj = 1;
        if (obj instanceof Integer) {
            System.out.println( value == ((Integer)obj).intValue());
        }
    }

    /**
     * 总结（https://www.cnblogs.com/laiso/p/9256120.html）：
     * 1.Integer 最大和最小值
     *   最大：01111111111111111111111111111111
     *   最小:10000000000000000000000000000000
     * 2.Integer 缓存、拆箱和装箱（-127 到 128（非固定值））
     *   Integer i = new Integer(2);
     *   Integer j = 2;//自动装箱（Integer.valueOf()）
     *   Integer k = 2;
     *  j 和 k所对应的堆地址相同
     *  i 和 j 所对应的堆地址不相同
     *
     *  Integer a = new Integer(2);
     *  int b = a;//自动拆箱(intValue())
     *
     *  boolean j = a; 包装类和基本类型进行运算时,隐式自动拆箱
     */
}
