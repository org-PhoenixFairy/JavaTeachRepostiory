package day04_2;
/**
 * 
 * 
 * @author Axford12
 *
 */
public class MyThread1 extends Thread{

	@Override
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println("2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
