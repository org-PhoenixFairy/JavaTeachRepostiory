package Day04_1;

/**
 * 
 * @author Axoford12
 * @since 2016.6.19
 * �ղ�������ѧϰ�˼̳�Thread ������������ѧϰʵ��Runnable �ӿ�
 * Ϊʲô���б����أ���Ϊ��ûʵ�ְ���
 * �����ŵ���������Ȼ��  Ctrl + 1  ���ǿ�����Run..�ǰɣ���������
 * д��д��
 *
 */
public class RunnableThreadStudy implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("����Runnable�߳�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
