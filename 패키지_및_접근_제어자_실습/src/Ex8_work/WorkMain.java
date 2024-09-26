package Ex8_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {

		// 배우검색 : lee
		// [lee]
		// 광해
		// 레드
		// 지아이조

		// 배우검색 : mmmm
		// 해당배우가 존재하지 않습니다
		String[][] actor = { { "[song]", "박쥐", "괴물", "관상" }, { "[ma]", "범죄도시", "더파이브", "챔피언" },
				{ "[lee]", "광해", "레드", "지아이조" } };

		Scanner sc = new Scanner(System.in);
		System.out.println("배우검색 : ");
		String name = sc.next();
		Work b = new Work();
		String r = b.yeah(name);

		if (r.equals("1")) {
			for (int i = 0; i < 4; i++) {
				System.out.println(actor[0][i]);
			}
		} else if (r.equals("2")) {
			for (int i = 0; i < 4; i++) {
				System.out.println(actor[1][i]);

			}
		} else if (r.equals("3")) {
			for (int i = 0; i < 4; i++) {
				System.out.println(actor[2][i]);
			}
		}else {
			System.out.println("해당배우가 존재하지 않습니다.");
		}

	}// main
}
