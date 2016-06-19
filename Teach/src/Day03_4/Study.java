package Day03_4;

public class Study {
	/*
	 *    -----------------------------------
	 *    Class 5      定义自己的异常和异常链
	 *    直接程序。
	 *    
	 *    -----------------------------------
	 */

	public static void main(String[] args) {
		try{
			Thread.sleep(1000);//这个1000表示毫秒数  1000就是1000毫秒也就是1秒
			
			try{
				Thread.sleep(1000);// try和catch是可以连用嵌套的，类似于if和for嵌套。但是这里没有break,continue,return.
			}catch(Exception e){
				
			}
		}catch(Exception e){
			
		}
	}
}
