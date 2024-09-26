package Ex5_method_gugudan;

import java.util.Scanner;

public class GuguMain {
public static void main(String[] args) {
	
	//단 : 5
	//5 * 1 = 5
	//5 * 2 = 10
	//....
	//5 * 9 = 45
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("단 : ");
	int a = sc.nextInt();
	
	PrintGugu p = new PrintGugu();
	p.print(a);
	
	
	
}//main
}
