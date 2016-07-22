package Game2048;

public class Main {

	public static void main(String[] args) {
		int[][] mtr = Methods.initial();
		Methods.display(mtr);
		Methods.move(mtr, 1);
		System.out.println("----------------");
		Methods.display(mtr);
		System.out.println("---------------------------");
		int[][] mtr2 = { { 2, 2, 2, 2 }, { 2, 2, 2, 2 }, { 2, 2, 2, 2 }, { 2, 2, 2, 2 } };

		Methods.display(mtr2);
		Methods.move(mtr2, 1);
		System.out.println("----------------");
		Methods.display(mtr2);
		// Success!
	}
}
