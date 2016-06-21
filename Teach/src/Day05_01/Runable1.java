package Day05_01;

public class Runable1 extends Thread implements Runnable{
		
		@Override
		public void run(){
			for (int i = 0; i < 10; i++) {
				System.out.println("+");
				
				Thread.yield();
			}
		}
	
	
	
}
