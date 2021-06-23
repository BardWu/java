package MyTest;

import java.io.BufferedReader;
import java.nio.ByteBuffer;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-03-21 14:53
 **/
public class StringTest {

    public static void main(String[] args) {

        String a = new String();
        // 该拼接仅存在于堆中，串池中没有。所以串池中内容 [a,b] 2457
        String s = new String("a") + new String("b"); //2460 添加三个 a ,b s
        //执行intern后,串池内容[a,b,ab].更重要一点是 s对象地址为串池中常量ab的地址
        String s1 = s.intern();
        System.out.println(s == s1);//2461
        System.out.println(s == "ab");
        System.out.println("--------------------");//2462

        String m = "cd";//2463
        String x = new String("c") + new String("d");//2466
        String x1 = x.intern();//2466
        System.out.println(x == x1);//2466
        System.out.println(x == "cd");//2466
        System.out.println(x1 == "cd");//2466

    }
}
