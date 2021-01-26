package workTest.dongfeng;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


import org.apache.commons.lang3.StringUtils;
import sun.misc.BASE64Encoder;

/**
* @Description: 数据转换工具类
* @author Yong 
* @date 2020年8月12日 下午11:19:07
 */
public class ConvertUtil {
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
	
	public static String aesEncrypt(String str, String key) throws Exception {
		if (str == null || key == null) return null;
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, new
                SecretKeySpec(key.getBytes("utf-8"), "AES"));
        byte[] bytes = cipher.doFinal(str.getBytes("utf-8"));
        return new BASE64Encoder().encode(bytes);
	}
	
	/**
	 * 
	* @Description: 时间转换
	* @param @return
	* @return String
	* @throws
	 */
	public static String getCurrentTime() {
    	Date date = new Date();
    	return format.format(date);
	}
	
	/**
	 * 
	* @Description: 时间转换
	* @param @return
	* @return String
	* @throws
	 */
	public static String getCurrentTime(long time) {
    	Date date = new Date(time);
    	return format.format(date);
	}
	
	public static String getExchangeCode(String interfaceName, String serialNo) {
		return interfaceName + getCurrentTime() + StringUtils.leftPad(serialNo, 8, "0");
	}
	
	/**
	 * 
	* @Description: 计算校验码
	* @param @param source
	* @param @return
	* @return String
	* @throws
	 */
	public static String checkCRC(String source) {
		if(StringUtils.isEmpty(source)) {
			 return null;
		}
		
		byte[] byteArray = null;
		try{
			byteArray = source.getBytes("ISO-8859-1");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		int crc_reg = 0XFFFF;
		for (int i = 0; i < byteArray.length; i++) {
			crc_reg = crc_reg >> 8 ^ byteArray[i];
			for (int j = 0; j < 8; j++) {
				int check = crc_reg & 0x1;
				crc_reg >>= 1;
				if (check == 1) {
					crc_reg ^= 0xA001;
				}
			}
		}
		
		if (crc_reg > 65535) return "FFFF";
		
		String asStr = Integer.toHexString((0xFFFF & crc_reg)).toUpperCase();
		int len = asStr.length();
		if (len < 4) {
			asStr = StringUtils.leftPad(asStr, 4, "0");
		}
		return asStr;
	}
}
