package Ex7_thread;

public class Ex1_singleThread extends Thread {

	//스레드는 독립적인 실행단위
	//한 번에 두 개이상의 프로세스를 실행 가능하게 해 준다 
	@Override
	public void run() {
		//프로세스의 톡립적인 수행을 위한 영역
		for(int i=0; i<10; i++) {
			System.out.println("스레드 실행중" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
