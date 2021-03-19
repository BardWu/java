package gitConflict;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-01-29 11:20
 **/
public class Test3 {


    private String conflictTest2;

    public Test3(String conflictTest2){
        this.conflictTest2 = conflictTest2;
    }

    public String getConflictTest2() {
        return conflictTest2;
    }

    public void setConflictTest2(String conflictTest2) {
        this.conflictTest2 = conflictTest2;
    }

    @Override
    public String toString() {
        return "Test3{" +
                "conflictTest2='" + conflictTest2 + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Test3> list = new ArrayList<>();
        Test3 test3 = new Test3("22");
        list.add(test3);
        list.stream().forEach(item->{
            item.setConflictTest2("333");
        });
        list.stream().forEach(System.out::println);

        System.out.println(changeDateTime(1614413741578L));
    }

    private static Long changeDateTime(Long time){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String dataString = simpleDateFormat.format(new Date(time));
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return  simpleDateFormat.parse(dataString).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }
}
