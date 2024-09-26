package Ex1_string;

import java.util.Scanner;

public class Ex5_String {
public static void main(String[] args) {
	
	//키보드에서 입력받은 값이 회문(수)인지 판단하기
	//------------------------------
	//입력하세요 : ab11ba
	//ab11ba 은(는) 회문입니다
	//abc 은(는) 회문이 아닙니다.
	
	Scanner sc = new Scanner(System.in);
	System.out.println("입력하세요 : ");
	String ori_a = sc.next();//원본
	String rev_a = "";//원본을 뒤집어서 저장할 변수
	//ori_a를 뒤집어서 rev_a저장
	for(int i=ori_a.length()-1; i>=0; i--) {
		rev_a+=ori_a.charAt(i);
	}
	if(ori_a.equals(rev_a)) {
		System.out.println(ori_a + "은(는) 회문입니다");
	}else {
		System.out.println(ori_a + "은(는) 회문이 아닙니다");
	}
	
//	int b =a.length();
//	int c= b%2;
//	
//	for(int i=0; i<a.length();i++) {
//	if(c=0) {
//		if()
//		 
//	}//if
//		
//	}//for
	
	
	
	
	
}//main
}
