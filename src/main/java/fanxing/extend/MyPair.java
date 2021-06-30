package fanxing.extend;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-06-25 16:42
 **/
public class MyPair<T> {

    private T first;


    public void setFirst(T first) {
        this.first = first;
    }
    //传入的类型T是固定的某一种
    void add(MyPair<T> p) {
        // ...
    }
    //传入的类型T是其本身或者其子类
    void add2(MyPair< ? extends T> p) {
        // ...
    }

    @Test
    public void test1(){

        MyPair<Number> pair = new MyPair<>();
        MyPair<Integer> pair2 = new MyPair<>();
        // Integer是Number的子类，但是Pair<Integer>不是Pair<Number> 的子类
        //   pair.add(pair2); //error
        pair.add2(pair2);

    }

    /**
     * extends的作用
     *
     *  方法参数类型List<? extends Integer>表明了该方法内部只会读取List的元素，不会修改List的元素
     */
    @Test
    public void test2(){

        List<? extends String> list = Arrays.asList("1","2","3");

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<list.size(); i++) {
            String n = list.get(i);
            // list.set(i,0); error
            list.remove(i);
            sb.append(n);
        }
        System.out.println(sb.toString());
        list.forEach(System.out::println);

    }

    public static void main(String[] args) {

        List<? extends String> list = Arrays.asList("1","2","3");

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<list.size(); i++) {
            String n = list.get(i);
            // list.set(i,0); error
             list.remove(i);
            sb.append(n);
        }
        System.out.println(sb.toString());
        list.forEach(System.out::println);
    }
   /* static int add(Pair<? extends Number> p) {
        Number first = p.getFirst();
        return p.getFirst().intValue();
    }*/
}
