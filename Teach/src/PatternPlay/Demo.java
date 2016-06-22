package PatternPlay;

import Exceptions.ParamNotCrrectFormEmailAddressException;

public class Demo {

	public static void main(String[] args) {
		try {
			System.out.println(PatternMain.getHost("847072154@qq.com"));
		} catch (ParamNotCrrectFormEmailAddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
