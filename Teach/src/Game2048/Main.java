package Game2048;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] mtr = Methods.initial();
		String str = null;
		Scanner sc = new Scanner(System.in);
		while(true){
			Methods.display(mtr);
			System.out.println("------------------");
			str = sc.nextLine();
			if(str.equals("w")){
				Methods.move(mtr, 1);
			}else if(str.equals("s")){
				Methods.move(mtr, 2);
			}else if(str.equals("a")){
				Methods.move(mtr, 3);
			}else if(str.equals("d")){
				Methods.move(mtr, 4);
			}else if(str.equals("e")){
				break;
			}
		}
		sc.close();
		
	}
}
