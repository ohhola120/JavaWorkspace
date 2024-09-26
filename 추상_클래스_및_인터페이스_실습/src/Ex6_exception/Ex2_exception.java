package Ex6_exception;

import java.util.Scanner;

public class Ex2_exception {
public static void main(String[] args) {
	
	//키보드에서 정수를입력받도록하고
	//정수가 입력되지 않을 때도 정상종료가 가능하도록 처리
	//-------------------------------------
	//정수 : 5
	//결과 : a
	//정수만 입력 할 수 있습니다.
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 : ");
	

	
	try {
		int a = sc.nextInt();
		System.out.println("결과 : " + a);
	}catch(Exception e) {
		System.out.printf("정수만 입력할 수 있습니다");
	}
	
	
	
	
}//main
}
