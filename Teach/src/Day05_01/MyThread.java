package Day05_01;

public class MyThread extends Thread{
	
		@Override
		public void run(){
			for (int i = 0; i < 10; i++) {
				System.out.println("+");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}
