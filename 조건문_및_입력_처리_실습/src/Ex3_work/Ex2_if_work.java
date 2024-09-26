package Ex3_work;

import java.util.Scanner;

public class Ex2_if_work {
	public static void main(String[] args) {

		// 윤년 구하기
		// 윤년 :
		// 1. 연도가 4로 나눠떨어지면 윤년
		// 2. 연도가 100으로 나누어 떨어지는 해는 평년
		// -> 4년 주기에 포함되어 있어도 100으로 ㄴ눠 떨어지면 평년
		// 3. 100으로 나눠지더라도 400으로도 함께 나눠진다면 윤년
		// 년도 : 2024
		// 2024년은 윤년입니다
		// 년도 : 2000
		// 2000년은 윤년입니다.

		Scanner sc = new Scanner(System.in);
		System.out.println("년도 : ");
		int y = sc.nextInt();
		String s = "";
		
		if (y % 400 == 0) {

			s = "윤년입니다.";
			
		
		} else if (y % 100 == 0) { 
			 
			s = "평년입니다.";

		}else if (y % 4 == 0) {
			s = "윤년입니다";
			
		}
		
		System.out.println(s);

	}// main

}
