package Day03;

public class index {

	public static void main(String[] args) {
		System.out.println("我是没有被包起来的语句 下面我要抛出异常");//
		System.out.println(1/0);//没被try包起来不会catch到异常。
		try{
			
			System.out.println(1/0);//给出异常算数异常  / by zero( 0做除数)
			System.out.println("我是try下面的语句");// 在try中上面语句抛出异常会直接到catch语句块然后到finally语句块
			// try下面的语句就不会被执行。
			// 
		}catch(ArrayIndexOutOfBoundsException  e){
			System.out.println("出现了数组越界异常");//可以看见我们抓住(catch)到了这个异常，并且对它处理
			// Catch中输捕获到异常，执行的语句，如果没有异常，catch语句不会被执行  Ok.
			//
		}catch(Exception e1){
			// 在一个try钟可以有多个catch.
			System.out.println("我是所有的异常父类");
		}finally{
			System.out.println("我是finally语句");// finally表示无论如何都会运行的语句
			//  Finally 中一定会执行，不论有没有异常.
			// Finally 语句块可以省略，但是try 和catch必须配套使用。
			// 这里我们说错了。看。
		}
		System.out.println("我是下面的语句？");//0.0是正确的，这里被执行了。
		// 异常处理->我们为什么要进行异常处理？
		// 如果 第6行抛出异常，那么程序中断，不会执行下面的语句。
		//   但是这样肯定不行啊，，我可是程序，，就这么停了！！
		// 于是就有了异常处理
		//   做笔记！
		/*
		 *   异常处理的关键字(Java中的):
		 *   1.try
		 *   2.catch
		 *   3.finally
		 *   下面我们小小的测试一下。   
		 */
		
	}
}
