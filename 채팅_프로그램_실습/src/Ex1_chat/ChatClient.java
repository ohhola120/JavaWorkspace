package Ex1_chat;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends Frame implements Runnable {

	TextArea area;
	TextField input;
	Button send_bt;

	// 서버 접속을 위한 객체
	Socket s;
	BufferedReader in;
	PrintWriter out;
	Thread t;

	public ChatClient() {
		setLayout(null);
		setBounds(400, 100, 400, 500);

		area = new TextArea();
		area.setBounds(10, 40, 380, 400);

		input = new TextField();
		input.setBounds(10, 450, 300, 30);
		send_bt = new Button("send");
		send_bt.setBounds(320, 450, 60, 30);

		this.add(area);
		add(input);
		add(send_bt);

		// 전송버튼에 이벤트 감지자
		send_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 서버에 메시지 전달
				String msg = input.getText().trim();
				if (msg.length() > 0)
					out.println(msg);

				// TextField의 내용을 비워준다
				input.setText("");

			}
		});

		// X버튼 클릭 감지자
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 서버의 스레드를 소명시키기 위해
				// 종료 메세지를 보낸다.
				out.println("xx:~!X");
			}
		});

		setVisible(true);

		connected();// 서버접속

		t = new Thread(this);
		t.start();
	}// 생성자

	// 서버 접속 메서드
	public void connected() {
		try {
			// 서버 접속
			s = new Socket("192.168.0.22", 3000);
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		// 서버로부터 전달되는 메세지를 기다렸다가
		// 메세지가 도착하면 화면에 출력 or 조료
		while (true) {
			try {
				String msg = in.readLine();
				if (msg.equals("xx:~!X"))
					break;

				if (msg != null)
					area.append(msg + "\n");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// 열려있는 스트림들 종료
		try {
			if (out != null)
				out.close();
			if (in != null)
				in.close();
			if (s != null)
				s.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.exit(0);
	}

}
