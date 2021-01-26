package myAnnotations.a_testSql;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-12-30 16:58
 **/
public class Main {


    public static void main(String[] args) {
        Person p = new Person(18,"张三","南京");
        createSql(p);
    }

    public static void  createSql(Person person){
        Class clazz = person.getClass();
        StringBuilder stringBuilder = new StringBuilder();
        //解析表名称
        if(clazz.isAnnotationPresent(Table.class)){
            Table table = (Table)clazz.getAnnotation(Table.class);
            stringBuilder.append("SELECT * FROM "+ table.value()+" where 1==1");
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        //解析方法
        for(Field field : declaredFields){
            if(field.isAnnotationPresent(Column.class)){
                //获取查询的字段名称
                Column column = field.getAnnotation(Column.class);
                String fieldName = column.value();
                //获取查询条件
                String methodName = "get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
               // System.out.println("methodName: "+methodName);
                Object methodResult = null;
                try {
                    //获取属性对应的get方法
                    Method method = clazz.getMethod(methodName);
                    //获取属性的值
                    methodResult = method.invoke(person,null);
                    //拼接SQL
                    if(methodResult != null){
                        if(methodResult instanceof  Integer){
                            stringBuilder.append(" and " +fieldName +" = "+ methodResult);
                        }
                        if(methodResult instanceof  String){
                            stringBuilder.append(" and " +fieldName +" = '"+methodResult+"'");
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(stringBuilder.toString());

    }

}
