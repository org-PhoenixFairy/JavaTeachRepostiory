package Day03_5;

public class Calculator {
	// ��������ǲ�����ôƴ�������ˡ���
	public double chufa(int i,int j) throws Exception{
		if(j==0){
			Exception e = new NumberException("/  by zero  -MyException");
			// ����������أ�ģ��ҲҪ"��Ȩ����"!
//			throw e;
			Exception e1 = new ComputeException("�������");
			e1.initCause(e);//��仰�ͱ�����e1����e��ɵġ�
			// ���ˣ����e1����쳣��ֻ��һ���ܿ��ĸ�����������󣬣���ô����Ҫ������ʾ
			throw e1;//�����׳�һ�������ˣ��׳����ԭ�򣬻���С�ģ�ϸ�µ�ԭ���Լ��׳�
			
			// ��ոտ��Ǹ����������host���Զ����³����㿴�Ҷ�û����Լ������ǰɡ�
			// Ҳ����˵Ϊʲô���м������ԭ������0��������
			// ���� ���ǿ�����Caused by �����쳣����
		}
		return i/j;
	}

}
