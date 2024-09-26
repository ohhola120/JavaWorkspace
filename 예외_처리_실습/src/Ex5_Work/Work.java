package Ex5_Work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Work extends Thread {

	List<String> list = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	Random rc = new Random();

	int a = 0;

	@Override
	public void run() {

		String[] arr = { "aaa", "bbb", "ccc", "ddd" };

		out: while (true) {
			String ranArr = arr[rc.nextInt(arr.length)];
			list.add(ranArr);
			System.out.println(list);
			System.out.println("입력 : ");
			String b = sc.next();
			if (b == list.get(0)) {
				list.remove(0);
				a -= 1;
				if (a == 0) {
					System.out.println("Win!");
					break out;
				}

			}

			try {

				System.out.println(list);
				a += 1;
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			} // catch

			

		} // while

	}// run

}
