package Day03_5;

public class index {

	public static void main(String[] args) {
		// �����������׳�����Խ���쳣  ʵ��ûԽ�ǰɡ��� �����׳����ˡ�
		// ��û�ܺ���  ���ǰ�java׽Ū��error�ˡ�
		// throw �����һ�����󣬲���ֱ���쳣��  throw Throwable(object)
		// �ã�throw �Ƚ������
		Calculator c = new Calculator();
		// Ϊɶû��ૡ�����
		try {
			c.chufa(1, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//����Ǵ�ӡ��ջ������Ϣ��
			
		}
		//�������ˡ���
		// ����û�У������������Լ����쳣��
	}
}
