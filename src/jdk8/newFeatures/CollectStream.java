package jdk8.newFeatures;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-07-21 09:01
 **/
public class CollectStream {

    private int age;


    public CollectStream(int age){
    //    System.out.println("age:"+age);
        this.age =age;
    }

    @Override
    public String toString() {
        return  "age:"+age;
    }

    public static void main(String[] args) {
        List<Map<String, String>> body = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("1","2");
        map.put("2","3");

        body.add(map);
        map = new HashMap<>();
        map.put("1","4");
        map.put("2","5");

        body.add(map);

        String[] strings = {"1","2"};


        //导出的数据添加 行数
        final List<Integer> indexList = new ArrayList<>();
        indexList.add(0);

        List<HistoricalDataImport> collect = body.stream().map(m -> {
            int index = indexList.get(0);
            indexList.add(0,++index);
            return  new HistoricalDataImport(Arrays.asList(strings), m,index);
        }).collect(Collectors.toList());

        for(HistoricalDataImport i: collect){
            System.out.println(i);
        }
    }

    @Test
    public void test1(){
        List<Map<String, String>> body = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("1","2");
        map.put("2","3");

        //导出的数据添加 行数
        final List<Integer> indexList = new ArrayList<>();
        indexList.add(-1);

        List<CollectStream> collect = body.stream().map(m -> {
            int index = indexList.get(0);
            indexList.add(0,++index);
            System.out.println("index:"+index);
            return new CollectStream(index);
        }).collect(Collectors.toList());
    //    System.out.println("i");
    }
}
