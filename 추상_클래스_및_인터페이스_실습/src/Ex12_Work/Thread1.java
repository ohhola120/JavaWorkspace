package Ex12_Work;

public class Thread1 extends Thread {
	
	int a=0;
	private boolean running = true;
	
	
	@Override
	public void run() {
		while(running) {
			
			try {
				Thread.sleep(1000);
				a++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//while
		System.out.println(a + "초");
	}
	public void setRunning(boolean runningState) {
		this.running=runningState;
	}

}
