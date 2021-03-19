package MyTest.heapTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-03-11 19:29
 **/
public class MyTest5 {

    public static void main(String[] args) throws Exception{
        List<Student> studentList = new ArrayList<>();
        for(int i = 0; i<10;i++){
            studentList.add(new Student());
        }
        Thread.sleep(60000*5);
    }
}
