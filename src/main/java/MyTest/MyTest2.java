package MyTest;

/**
 * @program: java
 * @description: 死锁
 * @author: wh
 * @create: 2021-03-11 16:33
 **/
public class MyTest2 {

    public static  Object obj1 = new Object();
    public static  Object obj2 = new Object();


    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj1){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj2){

                    }
                }

            }
        });
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj2){
                    synchronized (obj1){

                    }
                }

            }
        });
        thread2.start();
    }

}
