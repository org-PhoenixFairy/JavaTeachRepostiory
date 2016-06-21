package NoteMaker;

import java.util.Scanner;

public class LibMain {
	/**
	 * 
	 * @param msg
	 * 此String数组用于输出你的笔记，一个字符元素占一行，一行将停顿半秒输出。
	 * @param prog
	 * 这是一个Runnable，用于运行您的程序
	 */

	public static void NoteMake(String[] msg,Runnable prog){
		Scanner sc= new Scanner(System.in);
		int i=0;
		System.out.println("----开始打印笔记----");
		for(int j=0;j<msg.length;j++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg[i]);
		}
		System.out.println("----笔记打印完成----");
		System.out.println("");
		while(true){
			System.out.println("请输入是否运行程序程序");
			System.out.println("1 运行");
			System.out.println("0 不运行");
			String sel = sc.nextLine();
			try{
				
				i = Integer.parseInt(sel);
				if(i == 1){
					new Thread(prog).start();;
					break;
				}else if(i == 0){
					System.out.println("----结束程序----");
					System.exit(0);
				}
			}catch(Exception e){
				System.out.println("输入错误，请输入1或0");
				continue;
			}
		}
		sc.close();
	}
}
