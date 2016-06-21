package Day04_3;

import java.util.regex.Pattern;

/**
 * 
 * @author Axoford12 ������һ���ж��࣬�����ж��ַ����Ƿ������ص�����
 *
 */
public class Checker {
	/**
	 * ��������������ж��Ƿ�Ϊһ����Ч�ص����ʼ� ������POSIX
	 */
	private static final String mailPatter = "^[\\p" + "{Alnum}_\\-\\."
			+ "]+@[\\p{Alnum}" + "_\\-\\.]+\\.[\\p{Al" + "num}_\\-\\.]+$";

	
	
	//private static final String mailPatter1= "^[\\p]{Alnum}_\\-\\.]+@[\\p{Alnum}_\\-\\.]+"
	
	/**
	 * 
	 * @param addr
	 *            ����Ϊ�жϵĵ����ʼ���ַ
	 * @return ����ǵ����ʼ��򷵻��棬���Ƿ��ؼ١�
	 */
	public static boolean isEmail(String addr) {
		return Pattern.matches(Checker.mailPatter, addr);
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(Checker.mailPatter);
	}
}
