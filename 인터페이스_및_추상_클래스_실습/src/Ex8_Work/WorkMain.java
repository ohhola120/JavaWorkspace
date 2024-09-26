package Ex8_Work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		// 키보드에서 입력받은 문장의 홀수번째 문자만 추출하여 결과로 보여주기
		// 입력 : helloWorld
		// 결과 : hlool
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String ac = sc.next();
		
		
		Work work =new Work();
		
		String result = work.ac(input);
		
		System.out.println("결과 : ");
		System.out.println(result);
		
		
	}// main
}
