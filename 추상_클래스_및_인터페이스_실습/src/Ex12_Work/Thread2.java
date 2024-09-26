package Ex12_Work;

import java.util.Random;
import java.util.Scanner;

public class Thread2 extends Thread {
	private Scanner sc = new Scanner(System.in);
	private Random r = new Random();
	private int num = 0;
	private Thread1 timer;

	public Thread2(Thread1 timer) {
		this.timer = timer;
	}

	@Override
	public void run() {

		while (num < 5) {
			int n1 = r.nextInt(100) + 1;
			int n2 = r.nextInt(100) + 1;
			int plus = n1 + n2;

			System.out.printf("%d + %d =\n", n1, n2);
			System.out.println("답 : ");
			int a = sc.nextInt();

			if (a == plus) {
				System.out.println("정답!");
				num++;
			} else {
				System.out.println("땡!");
			}

		} // while
		System.out.println("문제를 모두 맞췄습니다.");
		timer.setRunning(false);
	}

}
