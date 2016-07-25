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
		ArrayList<Integer> notZeroNumbers = null;
		if (name == 1) {
			for (int i = 0; i < 4; i++) {
				notZeroNumbers = new ArrayList<Integer>();
				for (int j = 0; j < 4; j++) {
					if (mtr[j][i] != 0) {
						notZeroNumbers.add(mtr[j][i]);
					}
				}
				if (notZeroNumbers.size() == 1) {
					for (int j = 1; j < 4; j++) {
						mtr[j][i] = 0;
					}
					mtr[0][i] = notZeroNumbers.get(0);
				} else if (notZeroNumbers.size() == 2) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);

					if (a == b) {
						mtr[0][i] = a + b;
						for (int j = 1; j < 4; j++) {
							mtr[j][i] = 0;
						}
					} else {
						for (int j = 0; j < 4; j++) {
							mtr[j][i] = 0;
						}
						mtr[0][i] = a;
						mtr[1][i] = b;
					}
				} else if (notZeroNumbers.size() == 3) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);
					int c = notZeroNumbers.get(2);
					if (a == b || b == c) {
						if (a == b) {
							mtr[0][i] = a + b;
						} else {
							mtr[0][i] = a;
							mtr[1][i] = b + c;
							for (int j = 2; j < 4; j++) {
								mtr[j][i] = 0;
							}
						}
					}

				} else if (notZeroNumbers.size() == 4) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);
					int c = notZeroNumbers.get(2);
					int d = notZeroNumbers.get(3);

					if (a == b || b == c || c == d) {
						if (a == b) {
							mtr[i][0] = a + b;
							if (c == d) {
								mtr[1][i] = c + d;
								mtr[2][i] = 0;

							} else {
								Integer[] add = { a, c, d };
								for (int j = 1; j < 3; j++) {
									mtr[j][i] = add[j];
								}
							}

						} else {
							// a != b
							if (b == c) {
								mtr[1][i] = b + c;
								mtr[2][i] = d;
							} else {
								mtr[2][i] = c + d;
							}
						}

					}

				}
			}

		} else if (name == 2) {
			for (int i = 0; i < 4; i++) {
				notZeroNumbers = new ArrayList<Integer>();
				for (int j = 0; j < 4; j++) {
					if (mtr[j][i] != 0) {
						notZeroNumbers.add(mtr[j][i]);
					}
				}
				if (notZeroNumbers.size() == 1) {
					for (int j = 0; j < 4; j++) {
						if (j == 3) {
							mtr[j][i] = notZeroNumbers.get(0);
							continue;
						}
						mtr[j][i] = 0;
					}
				} else if (notZeroNumbers.size() == 2) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);

					if (a == b) {
						for (int j = 0; j < 4; j++) {
							if (j == 3) {
								mtr[j][i] = a + b;
							} else {
								mtr[j][i] = 0;
							}

						}
					} else {
						for (int j = 0; j < 4; j++) {
							if (j == 2) {
								mtr[j][i] = a;
							} else if (j == 3) {
								mtr[j][i] = b;
							} else {
								mtr[j][i] = 0;
							}
						}
					}
				} else if (notZeroNumbers.size() == 3) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);
					int c = notZeroNumbers.get(2);
					if (b == c || a == b) {
						mtr[0][i] = 0;
						mtr[1][i] = 0;
						if (b == c) {
							mtr[2][i] = a;
							mtr[3][i] = b + c;
						} else {
							mtr[2][i] = a + b;
							mtr[3][i] = c;
						}
					} else {
						int[] add = { a, b, c };
						for (int j = 0; j < 3; j++) {
							mtr[j][i] = add[j];
						}
						mtr[3][i] = 0;
					}
				} else if (notZeroNumbers.size() == 4) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);
					int c = notZeroNumbers.get(2);
					int d = notZeroNumbers.get(3);
					if (c == d || b == c || a == b) {
						mtr[0][i] = 0;
						if (c == d) {
							mtr[3][i] = c + d;
							if (a == b) {
								mtr[1][i] = 0;
								if (b == c) {
									mtr[2][i] = a + b;
								}
							} else {
								mtr[1][i] = a;
								mtr[2][i] = b;
							}

						} else if (b == c) {
							mtr[2][i] = b + c;
							mtr[1][i] = a;

						} else {
							// a == b
							mtr[1][i] = a + b;
						}
					}
				}
			}

		} else if (name == 3) {
			// Left
			for (int i = 0; i < 4; i++) {
				notZeroNumbers = new ArrayList<Integer>();
				for (int j = 0; j < 4; j++) {
					if (mtr[i][j] != 0) {
						notZeroNumbers.add(mtr[i][j]);
					}
				}
				if (notZeroNumbers.size() == 1) {
					for (int j = 0; j < 4; j++) {
						if (j == 0) {
							mtr[i][j] = notZeroNumbers.get(0);
							continue;
						}
						mtr[i][j] = 0;
					}
				} else if (notZeroNumbers.size() == 2) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);

					if (a == b) {
						for (int j = 0; j < 4; j++) {
							if (j == 0) {
								mtr[i][j] = a + b;
							} else {
								mtr[i][j] = 0;
							}

						}
					} else {
						for (int j = 0; j < 4; j++) {
							if (j == 0) {
								mtr[i][j] = a;
							} else if (j == 1) {
								mtr[i][j] = b;
							} else {
								mtr[i][j] = 0;
							}
						}
					}
				} else if (notZeroNumbers.size() == 3) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);
					int c = notZeroNumbers.get(2);
					if (a == b || b == c) {
						mtr[i][3] = 0;
						mtr[i][2] = 0;
						if (a == b) {
							mtr[i][0] = a + b;
							mtr[i][1] = c;
						} else {
							mtr[i][0] = a;
							mtr[i][1] = b + c;
						}
					} else {
						int[] add = { a, b, c };
						for (int j = 0; j < 3; j++) {
							mtr[i][j] = add[j];
						}
						mtr[i][3] = 0;
					}

				} else if (notZeroNumbers.size() == 4) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);
					int c = notZeroNumbers.get(2);
					int d = notZeroNumbers.get(3);

					if (a == b || b == c || c == d) {
						if (a == b) {
							mtr[i][0] = a + b;
							if (c == d) {
								mtr[i][1] = c + d;
								mtr[i][2] = 0;

							} else {
								Integer[] add = { a, c, d };
								for (int j = 1; j < 3; j++) {
									mtr[i][j] = add[j];
								}
							}

						} else {
							// a != b
							if (b == c) {
								mtr[i][1] = b + c;
								mtr[i][2] = d;
							} else {
								mtr[i][2] = c + d;
							}
						}

					}

				}
			}
		} else if (name == 4) {
			// Right
			for (int i = 0; i < 4; i++) {
				notZeroNumbers = new ArrayList<Integer>();
				for (int j = 0; j < 4; j++) {
					if (mtr[i][j] != 0) {
						notZeroNumbers.add(mtr[i][j]);
					}
				}
				if (notZeroNumbers.size() == 1) {
					for (int j = 0; j < 4; j++) {
						mtr[i][j] = 0;
					}
					mtr[i][3] = notZeroNumbers.get(0);
				} else if (notZeroNumbers.size() == 2) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);

					if (a == b) {
						for (int j = 0; j < 4; j++) {
							if (j == 3) {
								mtr[i][j] = a + b;
							} else {
								mtr[i][j] = 0;
							}

						}
					} else {
						for (int j = 0; j < 4; j++) {
							if (j == 2) {
								mtr[i][j] = a;
							} else if (j == 3) {
								mtr[i][j] = b;
							} else {
								mtr[i][j] = 0;
							}
						}
					}
				} else if (notZeroNumbers.size() == 3) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);
					int c = notZeroNumbers.get(2);
					if (b == c || a == b) {
						mtr[i][0] = 0;
						mtr[i][1] = 0;
						if (b == c) {
							mtr[i][2] = a;
							mtr[i][3] = b + c;
						} else {
							mtr[i][2] = a + b;
							mtr[i][3] = c;
						}
					} else {
						int[] add = { 0, a, b, c };
						for (int j = 1; j < 4; j++) {
							mtr[i][j] = add[j];
						}
						mtr[i][0] = 0;
					}
				} else if (notZeroNumbers.size() == 4) {
					int a = notZeroNumbers.get(0);
					int b = notZeroNumbers.get(1);
					int c = notZeroNumbers.get(2);
					int d = notZeroNumbers.get(3);
					if (c == d || b == c || a == b) {
						mtr[i][0] = 0;
						if (c == d) {
							mtr[i][3] = c + d;
							if (a == b) {
								mtr[i][1] = 0;
								if (b == c) {
									mtr[i][2] = a + b;
								}
							} else {
								mtr[i][1] = a;
								mtr[i][2] = b;
							}

						} else if (b == c) {
							mtr[i][2] = b + c;
							mtr[i][1] = a;

						} else {
							// a == b
							mtr[i][1] = a + b;
						}
					}
				}
			}
		} else {

		}
		addRandomNumber(mtr);
	}

	public static void addRandomNumber(int[][] mtr) {
		ArrayList<Integer[]> l = new ArrayList<Integer[]>();
		;
		for (int i = 0; i < mtr.length; i++) {
			for (int j = 0; j < mtr[i].length; j++) {

				if (mtr[i][j] == 0) {
					Integer[] add = { i, j };
					l.add(add);
				}
			}
		}
		// System.out.println(l.size());
		int di = (int) (Math.random() * l.size());
		if (di == 0) {
			return;
		}
		Integer[] p = l.get(di);
		mtr[p[0]][p[1]] = ramdomNumber[(int) (Math.random() * 2)];
	}

}
