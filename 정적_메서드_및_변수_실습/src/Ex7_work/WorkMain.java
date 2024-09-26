package Ex7_work;

import java.util.Scanner;

//입력 : aabbcca
//결과 :abc
public class WorkMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String a = sc.nextLine();
		
		String result = Work.Yeah(a);
		System.out.println("결과 : " + result);
				

	}
}
