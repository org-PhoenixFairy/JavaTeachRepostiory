package Day03;

public class index {

	public static void main(String[] args) {
		System.out.println("����û�б������������ ������Ҫ�׳��쳣");//
		System.out.println(1/0);//û��try����������catch���쳣��
		try{
			
			System.out.println(1/0);//�����쳣�����쳣  / by zero( 0������)
			System.out.println("����try��������");// ��try����������׳��쳣��ֱ�ӵ�catch����Ȼ��finally����
			// try��������Ͳ��ᱻִ�С�
			// 
		}catch(ArrayIndexOutOfBoundsException  e){
			System.out.println("����������Խ���쳣");//���Կ�������ץס(catch)��������쳣�����Ҷ�������
			// Catch���䲶���쳣��ִ�е���䣬���û���쳣��catch��䲻�ᱻִ��  Ok.
			//
		}catch(Exception e1){
			// ��һ��try�ӿ����ж��catch.
			System.out.println("�������е��쳣����");
		}finally{
			System.out.println("����finally���");// finally��ʾ������ζ������е����
			//  Finally ��һ����ִ�У�������û���쳣.
			// Finally �������ʡ�ԣ�����try ��catch��������ʹ�á�
			// ��������˵���ˡ�����
		}
		System.out.println("�����������䣿");//0.0����ȷ�ģ����ﱻִ���ˡ�
		// �쳣����->����ΪʲôҪ�����쳣����
		// ��� ��6���׳��쳣����ô�����жϣ�����ִ���������䡣
		//   ���������϶����а������ҿ��ǳ��򣬣�����ôͣ�ˣ���
		// ���Ǿ������쳣����
		//   ���ʼǣ�
		/*
		 *   �쳣����Ĺؼ���(Java�е�):
		 *   1.try
		 *   2.catch
		 *   3.finally
		 *   ��������СС�Ĳ���һ�¡�   
		 */
		
	}
}
