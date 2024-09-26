package Ex6_method_calculator;

import java.util.Scanner;

import Ex5_method_gugudan.PrintGugu;

public class CalMain {
public static void main(String[] args) {
	
	//수1 : 10
	//수2 : 5
	//연산자 : *
	//10 * 5 = 50
	
	Scanner sc = new Scanner(System.in);
	System.out.println("수1 : ");
	int a = sc.nextInt();
	System.out.println("수2 : ");
	int b = sc.nextInt();
	System.out.println("연산자 : ");
	String c = sc.next();
	CalPrint cp = new CalPrint();
	
	cp.pirntresult(a, b, c);
	
}//main
}
