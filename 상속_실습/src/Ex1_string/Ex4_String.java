package Ex1_string;

import java.util.Scanner;

public class Ex4_String {
public static void main(String[] args) {
	
	//키보드에서 아무값이나 입력받은 뒤,
	//입력받은 문장에서 소문자 a의 갯수를 판단하시오
	//------------
	//입력 : AfdajksahjiAfnjdskf
	//a의 갯수: 6
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("입력 : ");
	String n = sc.next();
	
	int a=0;
	
	
//	for(int i=0; i<n.length(); i++) {
//		char j = n.charAt(i);
//		if(j=='a') {
//			a++;
//		}
//	}System.out.println("a의 갯수 : " + a);
	
	
	for(int i=0; i<n.length(); i++) {
		if(n.charAt(i)=='a') {
			a++;
		}
	}
	System.out.println("a의 갯수 : " +a);
	
}//main
}
