package Ex_single_array;

import java.util.Scanner;

public class Ex2_single_array {
	public static void main(String[] args) {

		// 배열에 값을 입력해서 저장하고, 홀수와 짝수의 갯수를 찾아 출력
		// --------------------------
		// 배열의 크기 : 5
		// 정수 : 5
		// 정수 : 3
		// 정수 : 2
		// 정수 : 11
		// 정수 : 20
		// ----
		// 홀수 : 3
		// 짝수 : 2

		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기 : ");
		int x = sc.nextInt();
		int[] q = new int[x];
		int a = 0;
		int b = 0;
		for (int i = 0; i < q.length; i++) {
			System.out.printf("정수%d: ", i + 1);
			q[i] = sc.nextInt();

		} // for
		for (int i = 0; i < x; i++) {
			if (q[i] % 2 == 0) {
				a++;
			} else {
				b++;

			}
		}
		System.out.printf("홀수 : %d , 짝수 : %d", a, b);
		
//		for(int n : x) {
//			if(n%2==0) {
//				a++;
//			}else {
//				b++;
//			}
//		}
		

	}// main
}
