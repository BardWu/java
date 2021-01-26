package workTest.dongfeng;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2021-01-13 11:22
 **/
@Getter
@Setter
@ToString
public class AuthJsonDoc {

    /**
     * 鉴权数据类型
     */
    private static  String AUTH_TYPE = "30";

    private static int SERIAL_NUMBER;

    private final static int SERIAL_NUMBER_LENGTH = 8;

    /**
     * 交换类型
     */
    private String exchangeType;

    /**
     * 交换标识码
     */
    private String exchangeCode;

    /**
     * 上报数据时间
     */
    private String requestTime;

    private List<Auth> body;

    private String version;


    public AuthJsonDoc() {
        this.exchangeType = AUTH_TYPE;
        this.requestTime = new SimpleDateFormat("YYYYMMddHHmmss").format(new Date());
        this.version = "1.0";
    }

    /**
     * 创建交换唯一标识码
     * tips: 长度32为。10位用户名+14位时间+8位流水号
     */
    public void createExchangeCode(String jkSqm){
        if(StringUtils.isEmpty(jkSqm) || jkSqm.length() != 10){
            throw new RuntimeException("参数有误");
        }
        this.exchangeCode = jkSqm+this.requestTime+getSerialNumber();
    }

    /**
     * 获取8位流水号
     * @return
     */
    private String getSerialNumber(){

        synchronized (AuthJsonDoc.class){
            SERIAL_NUMBER++;
            int index ;
            StringBuilder stringBuilder = new StringBuilder();
            if((index = SERIAL_NUMBER_LENGTH - String.valueOf(SERIAL_NUMBER).length())<0){
                index = SERIAL_NUMBER_LENGTH-1;
                SERIAL_NUMBER  = 1;
            }
            for(int i=0; i<index;i++){
                stringBuilder.append("0");
            }
            stringBuilder.append(SERIAL_NUMBER);
            return stringBuilder.toString();
        }


    }
}
