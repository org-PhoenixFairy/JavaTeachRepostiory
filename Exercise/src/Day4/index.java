package Day4;

/**
 * 
 * 
 * 
 * @author Leonardo15
 * @since 2016-06-20
 * @version 多线程
 *
 */


public class index {

	public static void main(String[] args) {
		
		Thread t=new Mythread();
		Thread t2=new Mythread1();
		System.out.println(t.getPriority());
		System.out.println();
		
		
		t.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		
	}
	
	
	
	
	
	
	
	
	
}
