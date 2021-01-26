package myLang.datastuct;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-10-20 09:55
 **/
public class MyTest {

    private static final String VEHICLE_REAL_TIME_KEY = "VT_%s";
    @Test
    public void test1(){
        String vin = "LNBSCC4H8KD785514";
        System.out.println(String.format(VEHICLE_REAL_TIME_KEY, vin));

    }


    @Test
    public void test2(){
        Long time = 1577836800000L;
        Map map = new HashMap(2);
        Date date1 = new Date(time);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String format = sdf.format(date1);
        try {
            Date parse = sdf.parse(format);
            calendar.setTime(parse);
            calendar.add(Calendar.YEAR, 1);
            map.put("end", calendar.getTime().getTime() - 1);
            map.put("start", parse.getTime());

        } catch (Exception e) {

        }
        System.out.println(map);

    }
}
