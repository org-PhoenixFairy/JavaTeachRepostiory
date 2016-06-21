package Day05_01;

public class Test {
			
		public static void main(String[] args) {
			Thread t=new MyThread();
			t.start();
			for (int i = 0; i < 10; i++) {
				System.out.println("±¦±¦Á³ºìÁË");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	
	
}
