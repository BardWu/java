package workTest.dongfeng;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
* @Description: 响应消息
* @author Yong 
* @date 2020年8月18日 下午9:33:33
 */
@Setter
@Getter
@ToString
public class ResponseMessage {
	private String code;
	private String exchangeCode;
	private String exchangeType;
	private String message;
	private String requestTime;
	private String responseTime;
	private String version;
}
