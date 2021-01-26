package workTest.dongfeng;

/**
* @Description: 转发静态信息
* @author Yong 
* @date 2020年8月12日 下午9:11:25
 */
public class ForwardStaticInfo {
	//鉴权成功状态
	public final static int AUTH_SUCCESS_STATUS = 0;
	//允许转发状态
	public final static int ALLOW_FORWARD_STATUS = 1;
	
	//数据类型
	public final static int CMD_ID_0X0002 = 2;
	public final static int CMD_ID_0X0204 = 516;
	
	//地标无效和默认字符
	public static final String DEFAULT_VAL = "NA";
	public static final String INVAILD_VAL = "FF";
	
	//杭州地标转发平台代号
	public final static int HANG_ZHOU_FORWORD_PLATFORM_CODE = 1;
	
	//JSON KEY
	public final static String EXECHANGE_TYPE = "exchangeType";
	public final static String EXECHANGE_CODE = "exchangeCode";
	public final static String REQUEST_TIME = "requestTime";
	public final static String BODY = "body";
	public final static String VERSION = "version";
	
	public final static String JKYHM = "jkYhm";
	public final static String JKSQM = "jkSqm";
	public final static String CRC_CODE = "crcCode";
	public final static String WRITE_JSON_DOC = "WriteJsonDoc";
	
	//版本号
	public final static String VERSION_CODE ="1.0";
	
	public final static String URL_PREFIX = "http://";
	
	
	public final static String WRITE_OBJECT_OUT = "writeObjectOut.do";
	public final static String WRITE_FAULT_OBJECT_OUT = "writeFaultObjectOut.do";
	public final static String BEAT_OBJECT_OUT = "beatObjectOut.do";
	public final static String AUTH_OBJECT_OUT = "authObjectOut.do";
	
	//响应CODE
	public final static String SUCCESS_CODE = "1";
	public final static String FALIURE_CODE = "-1";
	public final static String FORMAT_FAILURE_CODE = "-2";
	public final static String DATA_IRRELEVANCY_CODE = "-3";
	public final static String DATA_CHECK_CODE = "-4";
	public final static String OTHER_FAILURE_CODE = "-9999";
	public final static String SYSTEM_FAILURE_CODE = "$E";
	
	public static final String STORE_FORWARD_KEY = "FORWARD:fw_";

	public static final String DEFAULT_FORWARD_ERROR = "重试三次失败";
	
}
