package Ex6_exception;

import java.util.Scanner;

public class Ex3_exception {
public static void main(String[] args) {
	//정수 : 100
	//정수 : 100
	//정수 : abc
	
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 : ");
	String a = sc.next();
	try {
		int b = Integer.parseInt(a);
		int c =b-1;
		int d =c+1;
		System.out.println("정수 : " +d);
		
	}catch(NumberFormatException e) {
		System.out.println(a+"는 정수가 아닙니다.");

	}
	System.out.println("정수 : ");
	String n = sc.next();
	try {
		int num = Integer.parseInt(n);
		System.out.println("결과 : "+ n);
		}catch(Exception e) {
			System.out.println(n + "은(는) 정수가 아닙니다.");
		}
	
}
}
