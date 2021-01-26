package workTest.Test;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import javax.validation.constraints.NotBlank;
import java.text.ParseException;
import java.util.Date;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-01-20 11:34
 **/
@Getter
@Setter
public class TestNotNull {

    @NotBlank
    private String name;

    @NotBlank
    private String age;

    public static void main(String[] args) {
        TestNotNull testNotNull = new TestNotNull();
        testNotNull.setAge(null);

        System.out.println(testNotNull.toString());


        String a = "12345678";
        System.out.println(a.substring(0,6));
        System.out.println(a);
    }

    private static String[] parsePatterns = {"yyyy-MM-dd","yyyy年MM月dd日",
            "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy/MM/dd",
            "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyyMMdd"};


    @Test
    public  void parseDate() {
        String string = "2004-12-16 17:24:27";
        String[] parsePatterns = {"yyyy-MM-dd"};

        try {
            System.out.println(DateUtils.parseDate(string, parsePatterns));
        } catch (ParseException e) {
           e.printStackTrace();
        }
    }
}
