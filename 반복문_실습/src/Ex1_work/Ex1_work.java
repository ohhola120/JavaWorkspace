package Ex1_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		// 키보드에서 입력받은 값 까지 반복하는 피보나치 수열 만들기
		// ---------------------------------------
		// 정수 : 5
		// 1 1 2 3 5
		// Scanner 객체를 생성하여 사용자로부터 최대 값을 입력받음

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int n = sc.nextInt();

		int a = 0, b = 1;

		for (int j = 0; j < 1; j++) {

			for (int i = 2; i <= n; i++) {

				int c = a + b;
				a = b;
				b = c;
				
				System.out.print(c +" ");
			}

		} System.out.println();

	}// main
}
