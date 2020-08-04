package myLang;

/**
 * @program: java
 * @description: 内部类-成员内部类
 * @author: wh
 * @create: 2020-08-03 16:37
 **/
public  class MyInnerClass {

    String name = "123";

    public void outInit(){
        System.out.println("name:"+name);
    }

    /**
     *   成员内部类
     */

    public class Inner{
        int age = 2;
        public void innerInit(){
            System.out.println("age:"+age);
        }
    }
    /**
     *   静态内部类
     */
    protected static class StaticInner{
        String sex = "男";
        public void staticInner(){
            System.out.println("sex:"+sex);
        }
    }


    /**
     * 内部类：
     * https://www.cnblogs.com/dolphin0520/p/3811445.html
     * 内部类：可以将一个类定义在另一个类里面或者一个方法里面，这样的类称为内部类
     * 1.成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）
     * 2.外部类想访问成员内部类的成员却不是这么随心所欲了。在外部类中如果要访问成员内部类的成员，
     *      必须先创建一个成员内部类的对象，再通过指向这个对象的引用来访问
     * 3.内部类有四中修饰权限
     * 4.一般来说，内部类是很少用来作为继承用的
     *
     * @param args
     */
    public static void main(String[] args) {
        //成员内部类是依附外部类而存在的，也就是说，如果要创建成员内部类的对象，前提是必须存在一个外部类的对象
        MyInnerClass myInnerClass = new MyInnerClass();
        MyInnerClass.Inner i = myInnerClass.new Inner();

        //静态内部类不需要外部类的存在
        //静态内部类不能访问外部类的非static 属性和方法
       StaticInner si = new MyInnerClass.StaticInner();

        /**
         * 创建规则：
         * 　　创建静态内部类对象的一般形式为：  外部类类名.内部类类名 xxx = new 外部类类名.内部类类名()
         *
         * 　　创建成员内部类对象的一般形式为：  外部类类名.内部类类名 xxx = 外部类对象名.new 内部类类名()
         */
    }

    /*
    * 　为什么在Java中需要内部类？总结一下主要有以下四点：

　　1.每个内部类都能独立的继承一个接口的实现，所以无论外部类是否已经继承了某个(接口的)实现，对于内部类都没有影响。内部类使得多继承的解决方案变得完整，

　　2.方便将存在一定逻辑关系的类组织在一起，又可以对外界隐藏。

　　3.方便编写事件驱动程序

　　4.方便编写线程代码

　　个人觉得第一点是最重要的原因之一，内部类的存在使得Java的多继承机制变得更加完善。
    * */
}
