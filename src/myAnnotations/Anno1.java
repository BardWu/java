package myAnnotations;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-08-04 16:32
 **/
@MyService
public class Anno1 {

    private String name;

    private int age;

    @MyAutowride
    private Anno2 anno2;

    public Anno1() {
        this.name = "张三";
        this.age = 1;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Anno2 getAnno2() {
        return anno2;
    }

    public void setAnno2(Anno2 anno2) {
        this.anno2 = anno2;
    }

    @Override
    public String toString() {
        return "Anno1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", anno2=" + anno2 +
                '}';
    }
}
