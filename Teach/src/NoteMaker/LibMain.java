package NoteMaker;

import java.util.Scanner;

public class LibMain {
	/**
	 * 
	 * @param msg
	 * ��String�������������ıʼǣ�һ���ַ�Ԫ��ռһ�У�һ�н�ͣ�ٰ��������
	 * @param prog
	 * ����һ��Runnable�������������ĳ���
	 */

	public static void NoteMake(String[] msg,Runnable prog){
		Scanner sc= new Scanner(System.in);
		int i=0;
		System.out.println("----��ʼ��ӡ�ʼ�----");
		for(int j=0;j<msg.length;j++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg[i]);
		}
		System.out.println("----�ʼǴ�ӡ���----");
		System.out.println("");
		while(true){
			System.out.println("�������Ƿ����г������");
			System.out.println("1 ����");
			System.out.println("0 ������");
			String sel = sc.nextLine();
			try{
				
				i = Integer.parseInt(sel);
				if(i == 1){
					new Thread(prog).start();;
					break;
				}else if(i == 0){
					System.out.println("----��������----");
					System.exit(0);
				}
			}catch(Exception e){
				System.out.println("�������������1��0");
				continue;
			}
		}
		sc.close();
	}
}
