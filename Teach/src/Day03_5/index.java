package Day03_5;

public class index {

	public static void main(String[] args) {
		// 我们无聊来抛出数组越界异常  实际没越是吧。。 看就抛出来了。
		// 有没很好玩  我们把java捉弄到error了。
		// throw 必须加一个对象，不能直接异常名  throw Throwable(object)
		// 好，throw 先讲到这里。
		Calculator c = new Calculator();
		// 为啥没有喃。。。
		try {
			c.chufa(1, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//这个是打印堆栈错误信息。
			
		}
		//这下有了。。
		// 看到没有，这样就有了自己的异常。
	}
}
