package Ex1_work;

public class Ex2_work {
public static void main(String[] args) {
	
	//1 2 3 4 5 6 7 8 9 10
	//2 3 4 5 6 7 8 9 10 1
	//3 4 5 6 7 8 9 10 1 2 
	//....................
	//10 1 2 3 4 5 6 7 8 9
	int n = 10;
	
	
	for(int i = 0; i < n; i++ ) {
		
		for(int j = 0; j < n; j++ ) {//x축
			
			System.out.print((i + j) % n + 1 + " ");
		}
		
		
		
		System.out.println();
	}
























}//main




}
