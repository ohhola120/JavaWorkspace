package Ex2_while;

public class Ex3_do_while {
	public static void main(String[] args) {

		// do-while문 - 선 처리 후비교
		// do{
		// 조건식이 참일 때 실해되는 영역
		//
		// }while(조건식);

		int a = 5;
		do {
			// 조건식에 상관없이 최초 한 번은 반드시 실행
			System.out.println(a);
			a++;

		} while (a <= 10);
		
		

	}// main
}
