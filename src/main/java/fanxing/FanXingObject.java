package fanxing;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-06-25 10:44
 **/
public class FanXingObject<T> {

    T temp;

    public FanXingObject(T temp){
        this.temp = temp;
    }

    public T getTemp(){
        return temp;
    }

    public void setTemp(T temp){
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "FanXingObject{" +
                "temp=" + temp +
                '}';
    }

    public static void main(String[] args) {
        FanXingObject<String> object = new FanXingObject<>("123");
        object.setTemp("456");

        FanXingObject<Integer> object2 = new FanXingObject<>(123);
        object2.setTemp(456);

        System.out.println(object);
        System.out.println(object2);
    }


    class FanXingObject2<T,U,X>{

        private T t;

        private U u;

        private X x;

    }
}
