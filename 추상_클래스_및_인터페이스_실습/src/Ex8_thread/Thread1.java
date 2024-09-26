package Ex8_thread;

public class Thread1 extends Thread2{
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print("1");
		}
	}

}
