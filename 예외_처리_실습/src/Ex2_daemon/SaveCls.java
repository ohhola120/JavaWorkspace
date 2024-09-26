package Ex2_daemon;

public class SaveCls implements Runnable {
@Override
public void run() {
	
	
	while(true) {
		try {
			Thread.sleep(3000);
			
			System.out.println("저장중...");
		} catch (InterruptedException e) {
			
			
			e.printStackTrace();
		}
		
	}
	
}
}
