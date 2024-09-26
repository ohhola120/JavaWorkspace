package Ex2_scanner;

import java.util.Scanner;

public class Ex2_scanner {
public static void main(String[] args) {
	//키보드에서 이름과 나이를 입력받고, 결과를 출력
	//-------------------------
	//이름 : 홍
	//나이 : 20
	//홍님의 나이는 20살입니다.
	//ctrl + O -> import java
	
	Scanner sc = new Scanner(System.in);
	System.out.println("이름 : ");
	String str = sc.next();
	System.out.println("나이 : ");
	int num = sc.nextInt();
	System.out.println("반갑습니다 " + str +"님 당신의 나이는 " + num + "세 입니다." );

	
	
	
	
	
}//main
}
