package day04_2;

/**
 * 
 * @author Axoford12 这里讲线程的优先级设置
 * TestCommit
 */
public class index {

	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread1();
		System.out.println(t1.getPriority());
		/* 这里我们看到了线程的优先级方法 默认优先级是：5 */
		System.out.println(t2.getPriority());

		System.out.println();

		// 下面改变优先级
		// t1.start();
		// t2.start();
		// 好了，我们可以看见 1,2,1,2这样很有规律，因为优先级都是5
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		// 改变t1的优先级为最大优先级
		// 改变t2的优先级为最小优先级
		t1.start();
		t2.start();
		// 线程还是很没有规律性，
		// 因为CPU的时间片分配我们管不到，，这里只是建议CPU先给t1分配
		
		// 下面看看  Github如何提交  先把前面的提交了。
	}
}
