package day04_2;

/**
 * 
 * @author Axoford12 ���ｲ�̵߳����ȼ�����
 * TestCommit
 */
public class index {

	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread1();
		System.out.println(t1.getPriority());
		/* �������ǿ������̵߳����ȼ����� Ĭ�����ȼ��ǣ�5 */
		System.out.println(t2.getPriority());

		System.out.println();

		// ����ı����ȼ�
		// t1.start();
		// t2.start();
		// ���ˣ����ǿ��Կ��� 1,2,1,2�������й��ɣ���Ϊ���ȼ�����5
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		// �ı�t1�����ȼ�Ϊ������ȼ�
		// �ı�t2�����ȼ�Ϊ��С���ȼ�
		t1.start();
		t2.start();
		// �̻߳��Ǻ�û�й����ԣ�
		// ��ΪCPU��ʱ��Ƭ�������ǹܲ�����������ֻ�ǽ���CPU�ȸ�t1����
		
		// ���濴��  Github����ύ  �Ȱ�ǰ����ύ�ˡ�
	}
}
