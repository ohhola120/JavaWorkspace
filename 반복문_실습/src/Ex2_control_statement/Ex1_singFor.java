package Ex2_control_statement;

public class Ex1_singFor {
	public static void main(String[] args) {
		
		
		//for문 특정 명령을 원하는 만큼 반복적으로 처리할 때 사용
		
		//for(초기식; 저간식; 증감식){
		// 조건식이 참일 때 수행되는 영역
		//}
		
		int n = 0;//전역 변수
		
		for( int i = 0; i <= 2; i++ ) {
			//i는 for문 안에서 생성된 지역변수 이므로
			//현재 for문을 벗어나면 사용이 불가능하다
			System.out.println(i);

			
		}//for
		
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		int a = 1;
		
		for( ; a < 3;  ) {
			
			System.out.println(a);
			a++;
			}
			
			System.out.println(a);
		
		
		
		
	}//main

}
