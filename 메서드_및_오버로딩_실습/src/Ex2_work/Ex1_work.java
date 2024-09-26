package Ex2_work;

import java.util.Random;

public class Ex1_work {
public static void main(String[] args) {
	
	//변수 money에 10~5000사이의 난수를 발생시켜 넣는다
		//단 , 1710, 3450과 같이 1의 자리 숫자는 반드시 0이어야 한다
		//coin배열을 사용하여 난수 money를 동전으로 바꿨을 때
		//가장 적은 수의 동전을 사용하는 경우의 수 출력
		//-------------------------------
		//값 : 2590
		//500원 : 5
		//50원 : 1
		//10원 : 4
	int[] coin = {500, 100, 50, 10};
	int i=0;
	int a = coin[0];
	int b = coin[1];
	int c = coin[2];
	int d = coin[3];
	
	
	int n1 = new Random().nextInt(500-10+1)+10;
	int n2 =n1*10;
	System.out.println("값 : " + n2);
	
	
	
	for(; i>=0; i++) {
		
		if(n2>a) {
			
			int e = n2 % a;
			n2/=a;
		System.out.println("500 원 : " + n2);
			if(e>b) {
				
				int f = e % b;
				e/=b;
				System.out.println("100원 : " + e);
				if(e>c) {
					System.out.println("50원 : " + 1);
					
					
						
					}
				}
			}
			
			
		}//if1
	}//for
	
	
	
	
}//main
}
