package Day03_5;

public class NumberException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ��Ȼ��֪��ʲô��˼��������Ϊǿ��֢���Ǽ��ϡ���
	// �����Լ����쳣���ȼ̳���Exception
	
	public NumberException(String msg){
		super(msg);//��Ӧ�û�֪��super�ɣ����ǽ���һ���ϡ���
		//���ˣ�����Ͷ������ˡ�
		// �Ƚ���һ���ؼ���  throw :  ���쳣�ġ�
	}

}
