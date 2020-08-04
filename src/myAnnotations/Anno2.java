package myAnnotations;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-08-04 16:32
 **/
@MyResource
public class Anno2 {

    private String name;

    private int age;

    public Anno2() {
        this.name = "李四";
        this.age = 2;
    }

    @Override
    public String toString() {
        return "Anno2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
