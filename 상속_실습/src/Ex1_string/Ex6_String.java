package Ex1_string;

import java.util.Scanner;

public class Ex6_String {
	public static void main(String[] args) {
		// 키보드에서 입력된 문장의 단어가 몇번 씩 썻는지 구하시오
		// ex1)
		// 입력 :abcabc
		// 결과 : a2b2c2
		// ex2)
		// 입력 : 010-3310-5852
		// 결과 : 0312-232528121
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String a = sc.next();

		String b = "";
		String c = "";

		for (int i = 0; i < a.length(); i++) {
			char d = a.charAt(i);
			
			
			
			if (b.indexOf(d) == -1) {
				int e = 0;
				
				
				
				for (int j = 0; j < a.length(); j++) {
					if (a.charAt(j) == d) {
						e++;
					}
				}

				c += d + String.valueOf(e);

				b += d;

			}

		}
		System.out.println("결과 : " + c);

	}// main
}
