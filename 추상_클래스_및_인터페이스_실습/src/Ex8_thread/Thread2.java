package Ex8_thread;

public class Thread2 extends Thread{
@Override
public void run() {
	for(int i=0; i<100;i++) {
		System.out.print("2");
	}
}
}
