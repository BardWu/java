package MyTest;

/**
 * @program: java
 * @description: 堆内存演示
 * @author: wh
 * @create: 2021-03-11 19:02
 **/
public class MyTest3 {

    public static void main(String[] args) throws Exception{
        System.out.println("1.....");
        Thread.sleep(30000);
        System.out.println("2.....");
        Byte [] bytes = new Byte[1024*1024*10];
        Thread.sleep(30000);
        System.out.println("3.....");
        bytes = null;
        System.gc();
        Thread.sleep(30000);
    }
}
