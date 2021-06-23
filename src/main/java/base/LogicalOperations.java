package base;

import org.junit.Test;

/**
 * @program: java
 * @description:  0000 1100 (12) 和  0000 0011 (3)  &&、&、||、|、~、^
 * @author: wh
 * @create: 2021-05-07 11:18
 **/
public class LogicalOperations {

    public static void main(String[] args) {
        //    0000 1100
        //  &
        //   0000 0011
        //   0000 0000 -> 0
        System.out.println(12 & 3);


        //    0000 1100
        //  |
        //   0000 0011
        //   0000 1111 -> 15
        System.out.println(12 | 3);

        // 0000 1100 ->  1111 0011 ;
        //  1111 0011 -1  ->  1111 0010 取反 -> 0000 1101 = -13
        System.out.println(~12);

        //    0000 1100
        //  ^
        //   0000 0011
        //   0000 1111(不同相同为1，相同为0) -> 15
        System.out.println(12 ^ 3);
    }



}
