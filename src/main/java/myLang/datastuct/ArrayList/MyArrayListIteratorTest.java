package myLang.datastuct.ArrayList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-10-22 11:47
 **/
public class MyArrayListIteratorTest {


    public static  ArrayList<Integer> init(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        return arrayList;
    }

    /**
     * 在当前节点的上一个节点添加数据
     */
    @Test
    public void add(){
        ArrayList<Integer> arrayList = init();

        ListIterator<Integer> iterator = arrayList.listIterator();

        System.out.println(iterator.next());
        iterator.add(4);

        System.out.println(arrayList);
    }

    /**
     * 在当前节点的上一个节点修改数据
     */
    @Test
    void set(){
        ArrayList<Integer> arrayList = init();

        ListIterator<Integer> iterator = arrayList.listIterator();
        System.out.println(iterator.next());
        iterator.set(0);
        System.out.println(arrayList);
    }

    /**
     * 删除当前节点上一个节点的数据
     */
    @Test
    void remvoe(){
        ArrayList<Integer> arrayList = init();

        ListIterator<Integer> iterator = arrayList.listIterator();
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(arrayList);
    }

    /**
     * previous 显示上一个节点的内容，并且将指针移到上一个
     */
    @Test
    void previous(){
        ArrayList<Integer> arrayList = init();

        ListIterator<Integer> iterator = arrayList.listIterator();
        System.out.println(iterator.next());
        iterator.previous();
        System.out.println(iterator.next());

        System.out.println(arrayList);
    }
}
