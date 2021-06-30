package fanxing;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-06-25 10:57
 **/
public interface FanXingInterface <T>{

    T get();

    void set(T t);

    class Obj<T> implements FanXingInterface<T>{

        private T t;
        @Override
        public T get() {
            return t;
        }

        @Override
        public void set(T t) {
           this.t =t;
        }
    }

    public static void main(String[] args) {
        Obj<String> obj = new Obj<>();
        obj.set("123");
        System.out.println(obj.get());
    }
}
