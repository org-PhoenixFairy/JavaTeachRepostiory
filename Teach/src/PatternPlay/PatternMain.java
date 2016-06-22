package PatternPlay;

public class PatternMain {
	private static final String MAIL_REGEX = "^[\\p{Alnum}_\\-\\.]+@[\\p{Alnum}_\\-\\.]+\\.[\\p{Alnum}_\\-\\.]+$";
	private static final String GET_ADDR_REGEX = "@";
	
	public static boolean isMail(String addr){
		return addr.matches(MAIL_REGEX);
	}
	public static String getHost(String addr){
		String[] r = addr.split(GET_ADDR_REGEX);
		return r[r.length-1];
	}
}
