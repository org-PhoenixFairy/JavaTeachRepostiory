package Game2048;

import java.util.ArrayList;

/**
 * 
 * @author Axoford12
 * @since 2016/7/22
 *
 */

public class Methods {

	protected static final int[] ramdomNumber = { 2, 4 };

	public static int[] getRamdomDimension() {
		int[] res = { (int) (Math.random() * 3) + 1, (int) (Math.random() * 3) + 1 };

		return res;

	}

	public static void display(int[][] mtr) {
		for (int i = 0; i < mtr.length; i++) {
			for (int j = 0; j < mtr[i].length; j++) {
				System.out.print(mtr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] initial() {
		int[][] mtr = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		mtr[getRamdomDimension()[0]][getRamdomDimension()[1]] = ramdomNumber[(int) (Math.random() * 2)];
		mtr[getRamdomDimension()[0]][getRamdomDimension()[1]] = ramdomNumber[(int) (Math.random() * 2)];
		return mtr;

	}

	/*
	 * 0002->0002;2002->0004
	 */
	public static void move(int[][] mtr, int name) {

		ArrayList<Integer[]> p;
		if (name == 1) {
			for (int i = 0; i < 4; i++) {
				p = new ArrayList<Integer[]>();
				for (int j = 0; j < 4; j++) {

					if (mtr[j][i] != 0) {
						Integer[] addValue = { mtr[j][i], j };
						p.add(addValue);
					}
				}
				// System.out.println(p.size());
				if (p.size() == 0) {

				} else if (p.size() == 1) {
					mtr[p.get(0)[1]][i] = 0;
					mtr[0][i] = p.get(0)[0];

				} else if (p.size() == 2) {
					if (p.get(0)[0] == p.get(1)[0]) {
						mtr[0][i] = p.get(0)[0] * 2;
					} else {
						mtr[p.get(0)[1]][i] = 0;
						mtr[0][i] = p.get(0)[0];
						mtr[p.get(1)[1]][i] = 0;
						mtr[1][i] = p.get(1)[0];
					}

				} else if (p.size() == 3) {
					if (p.get(0)[0] == p.get(1)[0]) {
						mtr[2][i] = 0;
						mtr[3][i] = 0;
						mtr[1][i] = p.get(2)[0];
						mtr[0][i] = p.get(0)[0] * 2;
						

					} else if (p.get(1)[0] == p.get(2)[0]) {
						mtr[1][i] = p.get(1)[0] * 2;
					} else {
						
					}
				} else if (p.size() == 4) {
					if ((p.get(0)[0] == p.get(1)[0]) && (p.get(2)[0] != p.get(3)[0])){
						mtr[0][i] = p.get(0)[0] * 2;
						mtr[1][i] = p.get(1)[0];
						mtr[2][i] = p.get(3)[0];
						mtr[3][i] = 0;
					} else if ((p.get(0)[0] == p.get(1)[0]) && (p.get(2)[0] == p.get(3)[0])){
						mtr[0][i] = p.get(0)[0] * 2;
						mtr[1][i] = p.get(2)[0] * 2;
						mtr[2][i] = 0;
						mtr[3][i] = 0;
					}
					// Update : 2016/7/22
				}

			}

		} else if (name == 2) {
			// Down
		} else if (name == 3) {
			// Left
		} else if (name == 4) {
			// Right
		} else {
			
		}
	}

}
