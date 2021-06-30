package fanxing;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-06-25 10:50
 **/
public class FanXingWay<T> {

    private T temp;

    public T get(){
        return temp;
    }

    public <T> void print(T t){
        System.out.println("t:"+t);
    }

    public void setTemp(T temp){
        System.out.println("temp:"+temp);
        this.temp = temp;
    }

    /**
     * 泛型方法
     * @param <U> 声明一个类型为U的泛型
     * @param u 类型为U的参数
     * @return 方法返回值类型为U
     */
    public <U> U get(U u){
        return u;
    }





    public static void main(String[] args) {
        FanXingWay<String> fanXingWay = new FanXingWay<>();
        fanXingWay.setTemp("123");
        fanXingWay.print(123);
        fanXingWay.print(123);
    }
}
