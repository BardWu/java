package myAnnotations.sealevel.test;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-12-30 15:45
 **/

public class TestObject {

    private String test;
    public static void main(String[] args) {
        System.out.println("aaa");
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "test='" + test + '\'' +
                '}';
    }
}
