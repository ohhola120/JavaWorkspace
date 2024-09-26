package Ex11_Thread;

public class Thread1 extends Thread{
	
	private int b;
	
	public Thread1(int b) {
		this.b = b;
	}
	
	@Override
	public void run() {
		for(int i=b; i>0; i--) {
			b--;
			System.out.println(b);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
