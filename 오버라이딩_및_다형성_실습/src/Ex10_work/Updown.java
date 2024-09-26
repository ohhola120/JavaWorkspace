package Ex10_work;

import java.util.Scanner;

public class Updown {
public int check(int a, int b){
	//키보드에서 받은 값이 up인지 down인지 정답인지 판단

	int count = 1;

	out: while (true) {
		Scanner sc = new Scanner(System.in); 
		
		
		if(a == num) {
			System.out.println(a+"회 만에 정답!");
			break out;
		}else if(a>num) {
			System.out.println("up!");
			System.out.print("값 : ");
			int num = sc.nextInt();
			count++;
		}else if(a<num) {
			System.out.println("Down!");
			System.out.print("값 : ");
			int num = sc.nextInt();
			count++;
		}
	
}
}
}