package Ex3_break;

public class Ex1_break {
public static void main(String[] args) {
	
	//break문 : 반목문 내에서 강제적으로 가장 가까운 반복문을 빠져나갈 때
	//사용하는 키워드
	
 for(int i = 0; i <=2; i++) {
	 
	 for(int j = 1; j <= 10; j++) {
		 
		 if(j % 2 == 0) {
			 break;//가장 가까운 반복문 탈출
			 //break 바로 아래에는 어떠한 코딩도 넣을 수 없다.
		 }
		 
		 System.out.print(j + " ");
		 
		 
	 }//in
	 
	 System.out.println();
 }//out
	
}//main
}
