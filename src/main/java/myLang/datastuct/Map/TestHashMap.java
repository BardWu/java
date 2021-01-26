package myLang.datastuct.Map;

import org.junit.Test;

import java.util.HashMap;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-10-28 15:37
 **/
public class TestHashMap {

    HashMap<String,String> hashMap;

    @Test
    void test1(){
        System.out.println((int)(16*0.75f));
        System.out.println(Integer.MAX_VALUE);
        System.out.println( 1 << 30);
    }

    @Test
    void test2(){
        hashMap = new HashMap();
        System.out.println(hashMap.put("1","1"));
        System.out.println(hashMap.put("1","3"));
    }

    @Test
    void test3(){
        Integer[] integers = new Integer[10];

        System.out.println();

    }

    @Test
    void test4(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(1);
        stringBuilder.append(2);
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 1));

    }
}
