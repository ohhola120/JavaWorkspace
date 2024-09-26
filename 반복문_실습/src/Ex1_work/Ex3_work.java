package Ex1_work;

public class Ex3_work {
public static void main(String[] args) {
	
	//    *
	//   ***
	//  *****
	// *******
	//*********
	
      for( int i = 0; i < 5; i++ ) {
		
		for( int j = 0; j < 5 + i; j++ ) {
			
			if( j + i > 3 ) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
			
		}
		
		System.out.println(); 
	} 
	
	/*System.out.println("-------");
	
	int s = 5;
	int space;
	for(int i=1; i<=s; i++) {
		
		space = s - i;
		
		for(int j=1; j<=space; j++) {
			System.out.print(" ");
		}
		
		for(int k=1; k<= 2+i-1; k++ ) {
			System.out.print("*");
		}
		System.out.println();
	} */
	
	
	
	
	
	
	
	
	
}//main 
}
