package myThread.juc.TestSynchronized;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-04-15 15:47
 **/
public class TestVolatile {

    static int b  =0;
    static int a = 0;
    static int x = 0;
    static int y = 0;



    public static void main(String[] args) throws InterruptedException{


        int i= 0;
        for(;;){
            i++;
         Thread start1 =    new Thread(new Runnable() {
                @Override
                public void run() {
                    b = 1;
                    x = a;
                }
            });

            Thread start2 =     new Thread(new Runnable() {
                @Override
                public void run() {
                    a = 1;
                    y = b;
                }
            });
            start1.start();start2.start();
            start1.join();start2.join();

            if(x ==0 && y ==0){
                System.out.println("i:"+i+",x:"+x+",y:"+y);
                System.out.println(a+","+b);
                break;
            }
        }
    }


}
