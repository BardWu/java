package workTest.dongfeng;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-01-13 11:12
 **/
public class TestMain {

    public static void main(String[] args) throws Exception{
        TestMain testMain = new TestMain();
        testMain.test2();





    }

    public void test1() throws Exception{
        try{
            int j = 1/0;
        }catch (Exception e){
            throw new Exception("123");
        }finally {
            System.out.println("finally");
        }
    }

    public void test2()throws Exception{
        test1();
    }
}
