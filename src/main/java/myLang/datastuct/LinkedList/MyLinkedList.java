package myLang.datastuct.LinkedList;

import org.junit.Test;

/**
 * @program: java
 * @description: 双链表实现 myLinkedList
 * @author: wh
 * @create: 2020-10-19 15:52
 **/
public class MyLinkedList<E> {

    private Node<E> first;

    private Node<E> last;

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;


        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public void push(E e){

        Node<E> newNode = null;

        if(first == null && last == null){

            newNode = new Node<>(null,e,null);
            first = newNode;
            last = newNode;
        }else {
            newNode =  new Node<>(last,e,null);
            last.next = newNode;
            last = newNode;

        }
    }

    public E pop(){

        if(first == last ){
            if(first == null){
                return null;
            }

            E e = first.item;
            first = null;
            last = null;

            return e;
        }
        Node<E> popNode = last;

        last = last.prev;
        last.next = null;

        return popNode.item;
    }



    public void queueIn(E e){

        Node<E> newNode;

        if(first == null && first == last ) {
                newNode = new Node<>(null, e, null);
                first = newNode;
                last = newNode;

        }else{
            newNode = new Node<>(null, e, null);
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
    }
    public E queueOut(){
        E e ;
        if( first == last ) {
           e = first == null ? null:first.item;
           first = null;
           last = null;

        }else {
            e = last.item;
            last = last.prev;
            last.next = null;
        }
        return e;
    }

    @Override
    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();

        if(first == last ){
            if(first == null){
                return null;
            }

            return String.valueOf(first.item);
        }

        Node<E> current = first;

        while (current.next != null){
            stringBuilder.append(String.valueOf(current.item)+"->");
            current = current.next;
        }
        stringBuilder.append(String.valueOf(current.item));

        return stringBuilder.toString();
    }


    @Test
    public  void TestStack() {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.push(1);
        myLinkedList.push(2);
        myLinkedList.push(3);

        System.out.println(myLinkedList.toString());

        myLinkedList.pop();

        System.out.println(myLinkedList.toString());

        myLinkedList.pop();

        System.out.println(myLinkedList.toString());

        myLinkedList.pop();

        System.out.println(myLinkedList.toString());

        myLinkedList.pop();

        System.out.println(myLinkedList.toString());
    }

    @Test
    public void testQueue(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.queueIn(1);
        myLinkedList.queueIn(2);
        myLinkedList.queueIn(3);

        System.out.println(myLinkedList);// 3 2 1

        System.out.println(myLinkedList.queueOut());

        System.out.println(myLinkedList);//  3 2

        System.out.println(myLinkedList.queueOut());

        System.out.println(myLinkedList);//  3 2
        System.out.println(myLinkedList.queueOut());

        System.out.println(myLinkedList);//  3 2

        System.out.println(myLinkedList.queueOut());

        System.out.println(myLinkedList);//  3 2

    }
}
