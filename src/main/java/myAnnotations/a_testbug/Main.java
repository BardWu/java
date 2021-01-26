package myAnnotations.a_testbug;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-11-24 20:18
 **/
public class Main {

    public static void main(String[] args) {
        check();
    }

    public static void check(){

        Class wayClazz = Ways.class;
        StringBuilder sb = new StringBuilder();
        int error = 0;

        Method[] methods = wayClazz.getDeclaredMethods();

        for(Method method:methods){
            if(method.isAnnotationPresent(TestBug.class)){
                try {
                    method.setAccessible(true);
                    method.invoke(wayClazz.newInstance(),null);
                }catch (Exception e) {
                    error ++;
                    sb.append(method.getName()+" method has error");
                    sb.append("\n\r caused by:");
                    sb.append(e.getCause().getMessage());
                    sb.append("\n\r");
                }
            }
        };

        sb.append(wayClazz.getName()+" has "+error+" error");
        System.out.println(sb.toString());
    }

}
