package myThread;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-03-16 15:44
 **/
public class TestInterrupted extends Thread{

    @Override
    public void run() {
        for(int i=0; i<100000;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end");
    }
    public static void main(String[] args) {


     //   try {
            TestInterrupted newThread = new TestInterrupted();
            newThread.start();
         //   TestInterrupted.sleep(2000);
            newThread.interrupt();
            System.out.println("newThread1 :"+newThread.isInterrupted());
            System.out.println("newThread2 :"+newThread.isInterrupted());
        System.out.println("newThread3 :"+TestInterrupted.interrupted());
         //   System.out.println("main thread interrupt 1:"+TestInterrupted.interrupted());//
      /*  } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
