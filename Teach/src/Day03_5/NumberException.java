package Day03_5;

public class NumberException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 虽然不知道什么意思，但是作为强迫症还是加上。。
	// 定义自己的异常，先继承自Exception
	
	public NumberException(String msg){
		super(msg);//你应该还知道super吧，我们讲了一晚上。。
		//好了，这儿就定义完了。
		// 先介绍一个关键字  throw :  抛异常的。
	}

}
