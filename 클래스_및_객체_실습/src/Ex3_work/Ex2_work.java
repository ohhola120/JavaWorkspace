package Ex3_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {

		// 키보드에서 입력받은 값 크기의 홀수 마방진 만들기
		// ----------------------------------
		// 홀수 : 3
		// 08 01 06
		// 03 05 07
		// 04 09 02
		Scanner sc = new Scanner(System.in);
		System.out.println("값 : ");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("홀수 값을 입력하십시오");

		} else {
			int arr[][] = new int[a][a];
			int n = 1;
			int r = 0;
			int c = a / 2;
			
			while (n <= a * a) {
				arr[r][c] = n;
				n++;
				
				int nr = r - 1;
				int nc = c + 1;
				
				if (nr < 0) {
					nr = a - 1;
				}
				if (nc == a) {
					nc = 0;
				}
				if (arr[nr][nc] != 0) {
					r += 1;
				} else {
					r = nr;
					c = nc;
				}

			} // while
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();

		} // else

	}// main
}
