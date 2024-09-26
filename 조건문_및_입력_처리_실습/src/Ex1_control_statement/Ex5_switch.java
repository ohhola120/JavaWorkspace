package Ex1_control_statement;

public class Ex5_switch {public static void main(String[] args) {
	char ch ='C';
			switch(ch) {
			case 'A'://조건값
				System.out.println("90~100");
				break;
			case 'B':
				System.out.println("89~80");
				break;
			case 'C':
				System.out.println("79~70");
				break;
			case 'D':
				System.out.println("69~60");
				break;
			case 'F':
				System.out.println("59~50");
				break;
			default:
				System.out.println("올바른 값을 입력하세요");
				break;
				
			}
}//main

}
