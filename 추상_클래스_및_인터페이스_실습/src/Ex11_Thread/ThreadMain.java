package Ex11_Thread;

import java.util.Scanner;

public class ThreadMain {
public static void main(String[] args) {
	//키보드애서 입력받은 숫자가 1씩 감소하다가(1초 간격 )
	//0이 되었을 때 스레드를 종료하는 코드를 작성
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 : ");
	int a = sc.nextInt();
	
	
	Thread1 thread = new Thread1(a);
	thread.start();
	
}
}
