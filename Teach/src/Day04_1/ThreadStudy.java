package Day04_1;
/**
 * 
 * @author Axoford12
 * @since 2016.6.19
 * ���ˣ���������ѧϰ�̵߳�ʹ�÷�������ѧϰ�̳�Thread�ӿ�������һ���߳�
 * ��ô����������߳̾�Ū���ˣ���ôִ�����أ�
 */

public class ThreadStudy extends Thread{
	@Override
	//  Override ������javac��������Ƿ�����д��������������OverrideȻ��û���
	// ����д�ͻᱨ�� ��������η��ű�ʾ����д�˷���java.lang.Thread.runҲ�����������
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("�����Լ����߳�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
