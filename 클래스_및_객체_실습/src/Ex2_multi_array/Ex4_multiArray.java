package Ex2_multi_array;

public class Ex4_multiArray {
	public static void main(String[] args) {

		int[][] num = new int[2][];
		num[0] = new int[3];
		num[1] = new int[2];
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;

		num[1][0] = 40;
		num[1][1] = 50;

		// 10 20 30
		// 40 50

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}// main
}
