package Ex1_string;

import java.util.Scanner;

public class Ex3_String {
public static void main(String[] args) {
	//주민 번호 : 901122-1234567
	//당신은 90년 11월 22일 에태어난 남자입니다
	
	Scanner sc = new Scanner(System.in);
	System.out.println("주민 번호 :");
	String n = sc.next();
	String year = n.substring(0,2);
	String month = n.substring(2,4);
	String day = n.substring(4,6);
	String s_gender = n.substring(7,8);
	int gen=Integer.parseInt(s_gender);
	if(gen %2==0) {
		s_gender="여자";
	}else {
		s_gender="남자";
	}
	System.out.printf("당신은%s년 %s월 %s일에 태어난 %s입니다",year,month,day,s_gender);

	
	
}//main
}
