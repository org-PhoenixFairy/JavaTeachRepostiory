package Day03_3;

public class Study {

	/*
	 *   首先介绍两个关键字
	 *   1.throw   :   手动的来抛出一个异常
	 *   2.throws  :   异常声明
	 *   
	 *   ---------------------------------------
	 *   Class 03   异常声明
	 *   	1.什么是异常声明 :   只我有个方法抛出了异常，不处理这个异常，而是对这个异常进行声明
	 *   		谁来调用，谁来处理这个异常.但是请注意，假设有异常，如果不声明，就必须捕获处理，不然
	 *   		java会报错！  诶这是你们程序猿的事情  两个人都不处理你找谁处理，找我吗？找我我就报错
	 *   			本节课关键字: throws 
	 *   ---------------------------------------
	 *   这里没有内容，只是更正一下刚刚将的知识点、
	 *   ---------------------------------------
	 *   下面将一个小内容
	 *   ---------------------------------------
	 *   
	 */

	public static void main(String[] args) throws InterruptedException{//在方法处声明异常。
//		Thread.sleep(1000);// 可以看到Eclipse给出了两个解决方案，第一个是异常声明,第二个是
//		// 假设不声明  那么Java直接抛出Error  所以看到JVM多凶残没。。
//		
//		// 增加trycatch。  这个Thread.sleep是线程中的知识。表示停止一段时间。InterruptedException会抛出这个异常
//	/*
//	 * 通过查看API我们看到了Thread.sleep的用法，也看到了一个声明异常的语句。这里我们也声明异常。
//	 */
		ThrowsTest.thowsTe();//换个名字，整成构造方法还得了。。
		// 正常运行  OK.
		// 听完以后自己写写程序测试一下，，别听完就傻了！
		
	}
	
}
