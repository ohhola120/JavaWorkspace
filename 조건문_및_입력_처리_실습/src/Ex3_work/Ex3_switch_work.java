package Ex3_work;

import java.util.Scanner;

public class Ex3_switch_work { public static void main(String[] args) {
	// 키보드에서 정수 두개와 연산자를 입력 받는다
	// 입력받은 두 정수의 연산 결과를 출력
	//----------------------------------------
	//ex)
	//수1: 15
	//수2: 20
	//연산자 : +
	//15 + 20 =35
	Scanner sc = new Scanner(System.in);
	System.out.println("수1 : ");
	int n1 = sc.nextInt();
	System.out.println("수2 : ");
	int n2 = sc.nextInt();
	System.out.println("연산자 : ");
	String a =sc.next();
	
	switch (a) {
	
	case "+":
		System.out.println(n1 + n2);
		break;
	case "-":
		System.out.println(n1 - n2);
		break;
	case "*":
	     System.out.println(n1 * n2);
	     break;
	case "/":
		System.out.println(n1 / n2);
		break;
	}
	
	
	
	
	
	
	
	
	
	
}//

}
