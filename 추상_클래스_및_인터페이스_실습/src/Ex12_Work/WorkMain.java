package Ex12_Work;



public class WorkMain {
public static void main(String[] args) {
	
	//1~100사이의 난수 두개를 더하는 문제를 출제
	//답을 입력하여 5문제가 정답처리 될 떄 까지 코드를 반복\
	//게임이 끝날 때 5문제를 모두 맞히는데 몇초가 걸렸는지를 출력
	//---------------------
	//23 + 48 = 71
	//정답
	//100 + 66 =10
	//오답
	//....
	//61 + 51 = 112
	//정답
	//결과 : 24초
	
	Thread1 timer=new Thread1();
	Thread2 problem=new Thread2(timer);
	
	
	timer.start();
	problem.start();
	
	try {
		problem.join();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("프로그램 종료");
	
}//main
}
