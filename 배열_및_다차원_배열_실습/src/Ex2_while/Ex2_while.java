package Ex2_while;

public class Ex2_while {
public static void main(String[] args) {
	
	//1 = 1 2 3 4 5
	//2 = 6 7 8 9 10
	//3 = 11 12 13 14 15
	//4 = 16 17 18 19 20 
	//5 = 21 22 23 24 25
	
	int i = 1;
	int j = 1;
	while(i <= 5) {
		
		System.out.print(i++ + " = ");
		
	for(int a = 1; a <= 5; a++) {
		System.out.print( j++ + " ");
	}
	
	System.out.println();
	
	}//while
	
	
}//main
}
