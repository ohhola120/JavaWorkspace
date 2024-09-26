package Ex2_control_statement;

import java.util.Scanner;

public class Ex5_singleFor {
	public static void main(String[] args) {

		// 키보드에서 정수 n1, n2를 입력 받는다
		// n1 부터 n2까지의 합을 계산하여 결과를 출력
		// 단 n1, n2의 순서를 다르게 입력 받아도 결과는 똑같이 출력
		// ----------------------
		// 수1: 3
		// 수2: 5
		// 결과: 12

		// 수1: 5
		// 수2: 3
		// 결과:12

		Scanner q = new Scanner(System.in);

		System.out.println("수1 : ");
		int a = q.nextInt();
		System.out.println("수2 : ");
		int b = q.nextInt();
		int z = b;
		int x = a;
		if (a < b) {
			for (int i = a; i < b; i++) {
				z += i;

			}
			System.out.println(z);
		} else if (a > b) {
			for (int i = b; i < a; i++) {
				x += i;

			}
			System.out.println(x);

		}

		System.out.println("-------------------------------------------------------");

		Scanner sc = new Scanner(System.in);

		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		System.out.print();
		int n2 = sc.nextInt();
		int result = 0;
        // 변수 두 개 값을 교환하는 공식
		if (n1 > n2) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}

		for (int i = n1; i <= n2; i++) {
			result += i;

		}
		System.out.println("결과 : " + result);

	}// main
}
