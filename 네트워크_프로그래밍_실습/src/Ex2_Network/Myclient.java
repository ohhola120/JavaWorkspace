package Ex2_Network;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Myclient {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		String msg = sc.nextLine();

		if (msg.trim().length() > 0) {

			Socket s = null;

			try {
				// 서버 접속
				s = new Socket("192.168.0.2", 3000);

				// 문자열 msg를 서버로 보내기 위한 스트림 준비
				PrintWriter out = new PrintWriter(s.getOutputStream());
				out.write(msg);

				out.flush();

				if (out != null)
					out.close();

				if (s != null)
					s.close();

			} catch (Exception e) {

			}

		}

	}// main
}
