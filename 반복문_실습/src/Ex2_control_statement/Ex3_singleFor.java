package Ex2_control_statement;

import java.util.Scanner;

public class Ex3_singleFor {
	public static void main(String[] args) {

		// 1부터 10까지의 숫자 중에서 홀수의 합을 계산하여 출력

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;

			} // if

		} // for
		System.out.println(sum);

//키보드에서 원금과 예치일을 입력 받는다
//은행 이자는 하루에 1원씩 추가된다
//예치일수가 끝나면 나의 원금이 얼마가 되었는지를 출력
//-------------------------------------
//원금 : 1000
//예치일 : 5
// 5일 후의 원금은 1005원입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원금 : ");
		int a = sc.nextInt();
		System.out.println("예치일 : ");
		int b = sc.nextInt();

		
		for (int i = 0; i< b; i++) {
			a++;
			
		}//for
		
		System.out.printf("%d일 후의 원금은 %d입니다.\n", b, a );
		
		
		
		
		
		
		
		
		
		

	}// main
}
