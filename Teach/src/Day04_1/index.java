package Day04_1;

/**
 * 
 * @author Axoford12
 * @since 2016.6.19 ��������ֱ��Main��������ʾ�� ���ǿ��Կ�����ִ������������������ִ�е��̣߳����Բ����ǰɡ������ǵ��̣߳�
 */
public class index {
		//�أ����ȴ�CPU����r�gƬ
		// �ֵ��˕r�gƬ�����̈��С� �r�gƬ��
	public static void main(String[] args) {
		Runnable my = new RunnableThreadStudy();
		// �ո�Eclipse��ʲô�񾭡���
		// ���ǿ����˷�������ȫ�����ɵģ�CPU���㷨����Ҳ��֪����
		// ����github
		Thread t = new Thread(my);
		// ����Ϊʲô��û��Start�أ���Ϊ������ʵ�ֵ��ǽӿڣ��ӿ�����û���ṩ
		// Start ������
		// Ϊʲô�ᱨ��֪����
		// QQ������
		// ���˷�API  ���Ƿ���Runnable ��  Thread�Ľӿ�
		t.start();// Ȼ��߀�ǲ�����������
		// ��������Ϊʲô. ������Start
		// ԭ����ʲ�N�أ���������̨������̫�h�ˡ���
		// ԭ���ǣ������ڈ����^���У����ȴ�CPU���YԴ����CPU�֕r�gƬ�o��
		// �҂�����׌Main������һ�¾����ǰ�
		// ����Start���ᣬ���M��;w��B��Ȼ�������CPU�����飬�҂��]�k���ٿ�
		// �����҂����W����ν��hCPU�Ƚo�l����r�gƬ��
		// ���ˣ����챾���n���ݾ��@�ӡ�
		for (int i = 0; i < 10; i++) {
			System.out.println("�����������߳�");
			try {
				Thread.sleep(1000);//��֪���ˡ�Ctrl + Shift + F ��Eclipse ��
				// �Ű��ݼ�������Ҳ��������뷨�Ŀ�ݼ�������
				// ������QQ����һ��Ok!
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// my.run();//�������÷����Բ����أ�
		// ����עጵ�
	}
}
