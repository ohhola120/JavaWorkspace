package Ex1_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Myserver extends Thread {

	ServerSocket ss;

	public Myserver() {
		try {
			//서버 준비 완료
			ss = new ServerSocket(3000);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		//무한반복 속에서 언제 접속할지 모르는 클라이언트를 받아야한다
		while(true) {
			try {
				//접속자를 받는다
				//접속자가 올 때까지 accept()를 수행하지 않고 기다린다
				Socket s = ss.accept();
				
			//방금 접속한 클라이언트의 ip주소
				String ip = s.getInetAddress().getHostAddress();
				
				System.out.println(ip + " 안녕?");
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}

}
