package Ex1_chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer extends Thread {

	ServerSocket ss;

	// 복사 클라이언트들을 담을 List
	List<CopyClient> list;

	public ChatServer() {

		try {
			list = new ArrayList<CopyClient>();
			ss = new ServerSocket(3000);
			System.out.println("서버시작");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		while (true) {

			try {

				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "님이 접속");

				// 접속자의 정보를 CopyClient로 보낸다
				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start();

			} catch (Exception e) {

			}

		}

	}

	public void sendMessage(String msg) {

		try {

			for (CopyClient cc : list) {
				// 서버의 모든 접속자들에게 메세지를 전달
				cc.out.println(msg);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void removeClient(CopyClient cc) {
		// 채팅을 종료하는 CopyClient객체를 list에서 삭제
		list.remove(cc);
		// 남아 있는 구성원들에게 퇴장 메시지 전달
		sendMessage("☆★" + cc.ip + "님 퇴장★☆");

	}

}
