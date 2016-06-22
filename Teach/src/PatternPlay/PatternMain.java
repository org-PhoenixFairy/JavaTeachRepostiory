package PatternPlay;

import Exceptions.ParamNotCrrectFormEmailAddressException;

public class PatternMain {
	private static final String MAIL_REGEX = "^[\\p{Alnum}_\\-\\.]+@[\\p{Alnum}_\\-\\.]+\\.[\\p{Alnum}_\\-\\.]+$";
	private static final String GET_ADDR_REGEX = "@";
	
	public static boolean isMail(String addr){
		return addr.matches(MAIL_REGEX);
	}
	public static String getHost(String addr) throws ParamNotCrrectFormEmailAddressException{
		if(!isMail(addr)){
			throw new ParamNotCrrectFormEmailAddressException("方法所给参数:"+addr+" 不是正确的电子邮件地址");
		}
		String[] r = addr.split(GET_ADDR_REGEX);
		return r[r.length-1];
	}
}
