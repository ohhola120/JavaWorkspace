package Ex1_control_statement;

public class Ex6_swich {public static void main(String[] args) {
	
	//switch문의 비교밧으로 사용할 수 있는 타입은
	//정수형(long제외), 문자, 문자열
	
	String last_name = "최";
	
	switch( last_name ) {//비교값
	case "김"://조건값
		System.out.println("21%");
		break;
	case "이":
		System.out.println("14%");
		break;
	case "박":
		System.out.println("8%");
		break;
	case "최":
		System.out.println("4%");
		break;
		
	default:
		System.out.println("데이터가 없습니다.");
		break;
		
	}//swich
	
	
	
}//main

}
