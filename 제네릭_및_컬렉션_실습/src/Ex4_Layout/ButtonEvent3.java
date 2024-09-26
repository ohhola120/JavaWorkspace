package Ex4_Layout;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonEvent3 {
	public static void main(String[] args) {

		Frame f = new Frame("메인 창");
		f.setLayout(null);
		f.setBounds(500, 200, 500, 300);
		// f.dispose();는 팝업창만 끌 수 있게 해주는 메서드

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Frame f2 = new Frame("종료확인");
				f2.setLayout(null);
				f2.setBounds(500, 200, 300, 200);

				Button btn1 = new Button("y");
				Button btn2 = new Button("n");
				btn1.setBounds(40, 70, 70, 50);
				btn2.setBounds(180, 70, 70, 50);
				// 글꼴 , 굴자스타일 ,글자크키
				Font font = new Font("", Font.PLAIN, 30);
				Label msg = new Label("정말로 종료??");
				msg.setBounds(20, 30, 200, 50);
				msg.setFont(font);
				f2.add(msg);

				ActionListener act = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String str = e.getActionCommand();

						switch (str) {
						case "y":
							System.exit(0);
							break;
						case "n":
							f2.dispose();
							break;

						}

					}// actionPerformed

				};// act

				f2.setResizable(false);

				btn1.addActionListener(act);
				btn2.addActionListener(act);

				f2.add(btn1);
				f2.add(btn2);
				f2.setVisible(true);

			}

		});

		f.setVisible(true);

	}// main
}
