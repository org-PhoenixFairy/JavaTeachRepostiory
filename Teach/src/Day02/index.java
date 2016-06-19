package Day02;

/**
 * 
 * @author Axoford12
 * 
 *
 */
public class index {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 5, 6, 7 } };
		// Defined a Array
		for (int i = 0; i < array.length; i++) {
			System.out.println("开始遍历数组的第 " + i + " 层楼");
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("开始遍历第 " + i + " 层楼的第 " + j + "房间");
				System.out.println("array[" + i + "]" + "[" + j + "] = " + array[i][j]);
			}
			System.out.println("-----------------");
			System.out.println("第 " + i + "层楼遍历完毕");
			System.out.println("-----------------");
		}
	}
}
