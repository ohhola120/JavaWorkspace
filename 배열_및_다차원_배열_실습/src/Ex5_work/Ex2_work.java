package Ex5_work;

public class Ex2_work {
public static void main(String[] args) {
	
	/*
	02 X 01 =02		03 X 01 =03 	04 X 01 = 4 ......
	02 X 02 =04
	....
	02 X 09 = 18
	*/
	
	for(int i = 2; i <= 9; i++) {
		for(int j = 1; j <= 9; j++) {
			System.out.printf("%02d x %02d = %d\n",a, i, (a * i));
			
		}
	}
	
	
	
}//main
}
