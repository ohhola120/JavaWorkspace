package Ex8_method;

import java.util.Scanner;

public class PalMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//키보드에서 입력받은 원본 문장을 뒤집어서 저장
	//입력받은 값이 회문인지 아닌지 판단
	
	System.out.println("문장 : ");
	String ori_a = sc.next();
	
	Palindrome ac = new Palindrome();
	String rev_a = ac.rotate(ori_a);
	
	
	if(ori_a.equals(rev_a)) {
		System.out.println(ori_a + "은(는) 회문입니다");
	}else {
		System.out.println(ori_a + "은(는) 회문이 아닙니다");
	}
	
}//main
}
