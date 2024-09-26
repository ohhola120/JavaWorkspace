package Ex2_while;

public class Ex1_while {
public static void main(String[] args) {
	//while문 : 간편한 구성을 가진 반복문
	//선비교 후 처리
	
	//whlie( 조건식 ){
	// 조건식이 참일 떄 실행 되는 영역
	//}
	
	int n = 1;
	while( n <= 3) {
		
		System.out.println(n);
		
		
		n++;
	}//while
	
	//5
	//4
	//3
	//2
	//1
	
	int a = 5;
	while(a > 0) {
		System.out.println(a);
		a--; 
	}
	
	
}//main
}
