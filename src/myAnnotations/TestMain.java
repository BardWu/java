package myAnnotations;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @program: java
 * @description: @Resources 和 @Autowired 简易实现
 * @author: wh
 * @create: 2020-08-04 16:46
 **/
public class TestMain {




    public static void main(String[] args) {


        TestMain testMain = new TestMain();
        Map<Class,Object>classes = testMain.createObject();

        Anno1 anno1 = (Anno1)classes.get(Anno1.class);

        System.out.println(anno1);

        Anno2 anno2 = (Anno2)classes.get(Anno2.class);

        System.out.println(anno2);

    }

    /**
     * 获取所有class对象
     * @return
     */
    List<Class> getClasses(){
        String url = "D:\\skill\\Java\\workSpace\\java\\src\\myAnnotations";
        //得到文件的包的路径
        File file = new File(url);
        //得到包下的文件
        String[] strings = file.list();

        List<Class> classes = new ArrayList<>();
        Arrays.stream(strings).forEach(x->{
            try {
                Class cc = Class.forName("myAnnotations."+x.replace(".java",""));
                classes.add(cc);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });

        return classes;
    }

    Map<Class,Object> createObject(){
        List<Class> classes = getClasses();

        Map<Class,Object> objectMap = new HashMap<>();
        classes.forEach(x->{
            try {
                if(x.isAnnotationPresent(MyResource.class)){

                    System.out.println("put key:"+x);
                    System.out.println("put value:"+x.newInstance());
                    //存储 class 对象 和 类对象
                    objectMap.put( x,x.newInstance());
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        });
        System.out.println("-------------------------");


        classes.forEach(x->{
            try {

                Field[] fields = x.getDeclaredFields();

                for (Field field : fields) {
                    if(field.isAnnotationPresent(MyAutowirde.class)){
                        field.setAccessible(true);
                        if(objectMap.containsKey(field.getType())){
                            Object obj = x.newInstance();
                            //给类对象的属性赋值
                            field.set(obj,objectMap.get(field.getType()));
                            objectMap.put( x,obj);
                        }
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        return objectMap;
    }
}
