package Day04_2;

public class MyThread extends Thread{

	@Override
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println("1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
