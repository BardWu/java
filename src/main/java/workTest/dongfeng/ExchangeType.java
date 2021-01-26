package workTest.dongfeng;

/**
* @Description: 交换类型
* @author Yong 
* @date 2020年8月15日 下午2:10:56
 */
public enum ExchangeType {
	HEART_INFO("00"),
	HEART_RESP_INFO("01"),
	WRITE_INFO("10"),
	WRITE_RESP_INFO("11"),
	FAILURE_INFO("20"),
	FAILURE_RESP_INFO("21"),
	AUTH_INFO("30"),
	AUTH_RESP_INFO("31");
	
	private String type;

	private ExchangeType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public static ExchangeType getExchangeType(String type) {
        for (ExchangeType t : values()) {
            if (t.getType().equals(type)) {
                return t;
            }
        }
        return null;
    }
}
