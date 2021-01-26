package myLang.datastuct.LinkedList;

/**
 * @program: java
 * @description: mylinkedList 单向 链表操作（栈形式）
 * @author: wh
 * @create: 2020-10-19 15:52
 **/
public class MyLinkedListTest<T> {

    private Node<T> first;


   private static class Node<T>{
       T t;

       Node<T>next;

       public Node(T t,Node<T>next){
           this.t =t;
           this.next = next;

       }

    }

    public void add(T t){

        Node<T>  newNode = new Node<>(t,null);;

        if( first == null){
            first = newNode;
        }else {
            Node<T> lastNode   = first;

            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }


    }
    public T remove(){
        Node<T> lastNode   = first;
        Node<T> secondNode = first ;

        if(first == null){
            return null;
        }

        while (lastNode.next != null){
            secondNode = lastNode;
            lastNode = lastNode.next;
        }

        if( lastNode == first){
            first = null;
        }
        secondNode.next = null;

        return lastNode.t;
    }
    @Override
    public String toString(){
       StringBuilder sb = new StringBuilder();

        if(first == null){
            return null;
        }

        Node<T> lastNode   = first;

        while (lastNode.next != null){
            sb.append(lastNode.t+"->");
            lastNode = lastNode.next;
        }
        sb.append(lastNode.t);
        return sb.toString();
    }

    public static void main(String[] args) {
        MyLinkedListTest<Integer> myLinkedList = new MyLinkedListTest();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println(myLinkedList);// 123

        System.out.println(myLinkedList.remove());//3
        System.out.println(myLinkedList);//12
        System.out.println(myLinkedList.remove());//2
        System.out.println(myLinkedList);//1
        System.out.println(myLinkedList.remove());//1
       System.out.println(myLinkedList.remove());//null
        System.out.println(myLinkedList);// null
        myLinkedList.add(3);
        myLinkedList.add(2);
        System.out.println(myLinkedList);//32
    }



}
