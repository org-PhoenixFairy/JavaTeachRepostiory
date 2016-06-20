package Day4;

public class Mythread extends Thread{
	
	@Override
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("我是自己的方法");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
