package Ex6_Work;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Coin {
public static void main(String[] args) {
	
	Frame f = new Frame();
	f.setLayout(null);
	f.setBounds(500, 200, 300, 500);
	Panel p = new Panel();
	p.setBounds(10, 50, 280, 30);
	p.setBackground(Color.GREEN);
	TextField tf = new TextField(15);
	Button btn = new Button("ok");
	btn.setBounds(0, 0, 100, 25);
	
	TextArea ta = new TextArea();
	ta.setBounds(10, 100, 280, 300);
	f.add(ta);
	btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int[] coin = { 500, 100, 50, 10 };
				int money = Integer.parseInt(tf.getText());
				StringBuffer result = new StringBuffer();
				for (int i=0; i < coin.length; i++) {
					int res = money / coin[i];
					if (res > 0) {
					result.append(coin[i]).append("원: ").append(res).append("\n");
						
						money %= coin[i];
					}

				} // for
				
				ta.setText(result.toString());
				
			} catch (Exception e2) {
				System.out.println("유효한 숫자를 입력하세요");
			}
			
		}
	});
	
	p.add(tf);// 입력상자는 panel에 추가
	p.add(btn);
	f.add(p);

	f.addWindowListener(new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {

			System.exit(0);
		}
	});

	f.setVisible(true);
}//main
}
