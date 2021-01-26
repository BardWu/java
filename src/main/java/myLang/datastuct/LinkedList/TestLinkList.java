package myLang.datastuct.LinkedList;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-10-21 16:14
 **/
public class TestLinkList {

    @Test
    public void test1(){
        LinkedList<Integer> linkList = new LinkedList<>();

        linkList.addFirst(1);
        linkList.addFirst(-1);
        linkList.addFirst(-2);
        linkList.addLast(2);

        System.out.println(linkList);
       /* System.out.println(linkList.peek());
        System.out.println(linkList.pop());*/

        /*System.out.println(linkList.poll());*/
        System.out.println(linkList.getFirst());
        System.out.println(linkList.getLast());
    }
}
