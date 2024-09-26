package Ex2_Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Myserver extends Thread {

	ServerSocket ss;
	
	public Myserver() {
		
		try {
			ss=new ServerSocket(3000);
			System.out.println("서버시작");
			
			
		} catch (Exception e) {
			
		}
		
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
			Socket s = ss.accept();
			
			String ip = s.getInetAddress().getHostAddress();
			
			//클라이언트는 접속과 동시에 문자열을 전송하기 때문에
			//서버에서 그문자열을 읽어와야한다
			BufferedReader reader = 
					new BufferedReader(
					new InputStreamReader(s.getInputStream() ));
			
			String msg = reader.readLine();
			
			System.out.println(ip + ":"+ msg);
			
			} catch (Exception e) {
				
			}
		}
		
		
		
		
	}
	
}
