package Day4;

public class MyThread2 {
		
		public static void main(String[] args) {
			Runable1 a=new Runable1();
			Thread t=new Thread(a);
			t.start();
			
		}
		}

		class Runable1  implements Runnable{
			@Override
			public void run(){
			 for (int i = 0; i < 5; i++) {
				System.out.println("我是自己的方法");
			}
		 }
			
			
			
		}
	
	
