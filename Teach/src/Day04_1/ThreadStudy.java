package Day04_1;
/**
 * 
 * @author Axoford12
 * @since 2016.6.19
 * 好了，这里我们学习线程的使用方法，先学习继承Thread接口来创建一个线程
 * 那么这样子这个线程就弄好了，怎么执行它呢？
 */

public class ThreadStudy extends Thread{
	@Override
	//  Override 代表由javac来检查你是否是重写了这个方法如果有Override然而没检查
	// 到重写就会报错 这个三角形符号表示你重写了方法java.lang.Thread.run也就是这个方法
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("我是自己的线程");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
