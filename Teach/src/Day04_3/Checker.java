package Day04_3;

import java.util.regex.Pattern;

/**
 * 
 * @author Axoford12
 * 本类是一个判断类，用于判断字符串是否满足特点条件
 *
 */
public class Checker {
	/**
	 * 这个常量被用于判断是否为一个有效地电子邮件 风格采用POSIX
	 */
	private static final String mailPatter = "^[\\p"
			+ "{Alnum}_\\-\\."
			+ "]+@[\\p{Alnum}"
			+ "_\\-\\.]+\\.[\\p{Al"
			+ "num}_\\-\\.]+$";
	

	/**
	 * 
	 * @param addr
	 * 参数为判断的电子邮件地址
	 * @return
	 * 如果是电子邮件则返回真，不是返回假。
	 */
	public static boolean isEmail(String addr){
		return Pattern.matches(Checker.mailPatter, addr);
	}
}
