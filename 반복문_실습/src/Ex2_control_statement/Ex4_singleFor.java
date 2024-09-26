package Ex2_control_statement;

import java.util.Scanner;

public class Ex4_singleFor {
public static void main(String[] args) {
	
	//키보드에서 값을 받고, 임력받은 값에 해당하는구구단을 출력
	//--------------------------------------------
	//값 : 1
	//2~9사이의 값을 입력하세요
	
	//값 3
	//3 x 1 = 3
	//3 x 2 = 6
	//...
	//3 x 9 = 27
	
	Scanner sc = new Scanner(System.in);
	System.out.println("값 : ");
	int a = sc.nextInt();
	
		
		if(a<=1|| a>= 10) {
			System.out.println("2~9사이의 값만 입력하세요");
			
		}else {
			
			for( int i = 1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n",a, i, (a * i));
			}
		}
	//}//for

	System.out.println("-------------------------------------------------------------------------------------------");
	//키보드에서 정수 n을 입력받는다
	//1부터 n까지의 합을 계산하여 결과를 출ㄹ겨
	//------------------------------
	//정수 : 5
	//결과 : 15 
	
	
	System.out.println("정수 : ");
	int n = sc.nextInt();
	int p = 0;
	for(int i=1; i<=n; i++ ) {
		p +=i;
	}//for
	System.out.println("결과 : " + p);
	
	
	
	
	
	
	
	
	
	
	
}//main
}
