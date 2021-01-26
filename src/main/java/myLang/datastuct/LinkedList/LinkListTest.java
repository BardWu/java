package myLang.datastuct.LinkedList;

import org.junit.Test;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-10-20 09:55
 **/
public class LinkListTest {


    /**
     * linkedList 在遍历的过程中如果被非当前遍历器修改，报错
     */
    @Test
    public void test0(){

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        ListIterator<Integer> iterator = (ListIterator)linkedList.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();

            System.out.println(i);
            linkedList.add(4);

        }

    }

    /**
     * LinkedList iterator
     * 是在当前节点的上一个节点添加内容
     */
    @Test
    public void test1(){

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        ListIterator<Integer> iterator = (ListIterator)linkedList.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if(i == 2){
                iterator.add(4);
            }
            System.out.println(i);

        }
        System.out.println("------------");
        iterator = (ListIterator)linkedList.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();

            System.out.println(i);

        }
    }

    /**
     * LinkedList iterator
     * 遍历到当前节点，previous() 使当前的节点的指向 指向上一个节点。
     */
    @Test
    public void test2(){

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        ListIterator<Integer> iterator = (ListIterator)linkedList.iterator();

       /* Integer i = iterator.next();
        // 1 ；当前节点的指向 指向 2
        System.out.println(i);*/
        // 1； 当前节点的指向 指向2 ,那previous 则是 1，顺便把当前节点的指向 指向 1。
       /* System.out.println(iterator.previous());*/
        // 1；

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        System.out.println(iterator.previous());
        System.out.println(iterator.previous());
    }

    /**
     * remove 用法
     * 移除当前节点上一个节点的内容
     * next()一次，remove一次
     */
    @Test
    public void test3(){

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        ListIterator<Integer> iterator = (ListIterator)linkedList.iterator();

        Integer i = iterator.next();
        System.out.println(i);

        iterator.remove();

        System.out.println(linkedList);

    }
    /**
     * set 用法
     * 修改当前指向的上一个指向的内容
     *
     */
    @Test
    public void test4(){

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        ListIterator<Integer> iterator = (ListIterator)linkedList.iterator();

        Integer i = iterator.next();
        //1;
        System.out.println(i);

        iterator.set(4);

        System.out.println(linkedList);
    }
}
