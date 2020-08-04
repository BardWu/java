package myLang;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * @program: java
 * @description: StringBuilder
 * @author: wh
 * @create: 2020-08-04 10:40
 **/
public class MyStringBuilder {


    @Test
    void test1(){
        char[] chars =new  char[1];
        chars[0]='a';
        chars = Arrays.copyOf(chars,10);
        System.out.println(chars.length);
        System.out.println(chars[2]+":->");
    }

    /**
     * length:char数组存放内容的个数
     * capacity:char数组的长度
     */
    @Test
    void test2(){
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
    //左移和有移
    @Test
    void test3(){
        int newCapacity = (10 >> 1) + 2;
        System.out.println(newCapacity);
        // 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0
        //0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0
    }
    @Test
    void test4(){
        char[] chars =new  char[5];
        final char[] value = chars;
        int c = 0;
        value[c++] = 'n';
        value[c++] = 'u';
        value[c++] = 'l';
        value[c++] = 'l';

        System.out.println(chars[0]);
        System.out.println(value[0]);
    }
    char[] value;
    //扩充数组
    @Test
    void test5(){
        value = new char[5];
        int c = 0;
        value[c++]='a';
        value[c++]='a';
        value[c++]='a';
        value[c++]='a';
        value[c++]='a';
        char dst[] = new char[6];
        dst[0] = 'b';

        getChars(0,5,dst,1);
        for (char c1 : dst) {
            System.out.println(c1);
        }
    }

    /**
     * 给dst数组拷贝数据
     * @param srcBegin 拷贝数组的起始位置
     * @param srcEnd 拷贝数组的结束位置
     * @param dst 被拷贝的数组
     * @param dstBegin 被拷贝数组的起始位置
     */
    public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin) {
        if (srcBegin < 0) {
            throw new StringIndexOutOfBoundsException(srcBegin);
        }
        if (srcEnd > value.length) {
            throw new StringIndexOutOfBoundsException(srcEnd);
        }
        if (srcBegin > srcEnd) {
            throw new StringIndexOutOfBoundsException(srcEnd - srcBegin);
        }
        System.arraycopy(value, srcBegin, dst, dstBegin, srcEnd - srcBegin);
    }

    @Test
    void  test6()throws Exception{
        String url = "C:\\Users\\BardWu\\Desktop\\stringBuilder.txt";
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.append(3);
        sb.append(4);

        FileOutputStream fileOutputStream = new FileOutputStream(url);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(sb);

        StringBuilder sb2 = new StringBuilder();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(url));
        sb2 =(StringBuilder) objectInputStream.readObject();
        System.out.println("sb2:"+sb2);

    }
}
