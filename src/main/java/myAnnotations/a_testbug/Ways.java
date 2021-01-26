package myAnnotations.a_testbug;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-11-24 20:17
 **/
public class Ways {

    @TestBug
    public int  add(){
        int i = 5;
        int j = 0;
        int z = i + j;
        return z;
    }

    @TestBug
    public int reduce(){
        int i = 5;
        int j = 0;
        int z = i - j;
        return z;
    }

    @TestBug
    public int multiply(){
        int i = 5;
        int j = 0;
        int z = i * j;
        return z;
    }

    @TestBug
    public int divide(){
        int i = 5;
        int j = 0;
        int z = i / j;
        return z;
    }
}
