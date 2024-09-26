package Ex3_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
		
		//다중 for문 : for문 안에 for문이 들어가 있는경우
		// 1 2 3
		// 1 2 3
		
		for(int  i = 1; i <=2; i++) {//행(y축)
			
			for(int j = 1; j <= 3; j++) {//열(x축)
				
				System.out.print(j + " ");
				
				
			}//inner
			
			System.out.println();//개행
			
		}//outer
		
	System.out.println("-------------------------------------------------------------");
	
	for(int a = 1; a<=3; a++) {
		for (int b = 1; b <= 5; b++) {
			System.out.print(b + " ");
		}
		System.out.println();
	}
	
	System.out.println("-----------------------------------------------------------------");
	
	for(int q = 1; q <=3; q++ ) {
		for (int w=3; w>=1; w--) {
			System.out.print(w + " ");
		}
		System.out.println();
	}
	System.out.println("---------------------------------------------------------------------");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//main

}
