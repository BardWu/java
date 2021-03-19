package workTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-01-13 10:59
 **/
public class MyTest {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        List<Map> list = new ArrayList<>();

        map.put("code","1");
        map.put("name","2");

        list.add(map);
        map = new HashMap<>();
        map.put("code","11");
        map.put("name","22");
        list.add(map);

       List<Object> list1 =  list.stream().map(item->item.get("code")).collect(Collectors.toList());
        list1.forEach(System.out::println);

        Long id = null;
        Long ids = null;
        System.out.println(String.valueOf(id).equals("null"));
        System.out.println("测试 撤销远程提交");
    }
}
