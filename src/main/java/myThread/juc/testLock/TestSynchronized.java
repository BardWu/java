package myThread.juc.testLock;

/**
 * @program: java
 * @description:  synchronized 生产者 消费者
 * @author: wh
 * @create: 2021-04-21 09:35
 **/
public class TestSynchronized {

    public static void main(String[] args) {
        NodeNumber nodeNumber = new NodeNumber();

        new Thread(()->{
            for (int i=0; i<20;i++){
                nodeNumber.add();
            }
        }).start();

        new Thread(()->{
            for (int i=0; i<20;i++){
                nodeNumber.res();
            }
        }).start();

        new Thread(()->{
            for (int i=0; i<20;i++){
                nodeNumber.add();
            }
        }).start();


        new Thread(()->{
            for (int i=0; i<20;i++){
                nodeNumber.res();
            }
        }).start();
    }

}

class NodeNumber{

    private int number;

    public synchronized void add(){

        try {
            //1.判断是否需要等待
            while (number != 0){
                this.wait();
            }
            //2.执行业务
            number++;
            System.out.println(Thread.currentThread().getName()+" add "+number);
            //3.唤醒
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void res(){
        try {
            //1.判断是否需要等待
            while(number == 0){
                this.wait();
            }
            //2.执行业务
            number--;
            System.out.println(Thread.currentThread().getName()+" add "+number);
            //3.唤醒
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
