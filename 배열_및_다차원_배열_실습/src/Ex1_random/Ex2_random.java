package Ex1_random;

import java.util.Random;

public class Ex2_random {
	public static void main(String[] args) {

		// Random클래스를 이용하여
		// 대문자 A~Z사이의 값중 하나를 랜덤으로 출력
		// 결과 : G

		int a = new Random().nextInt(90 - 65 + 1) + 65;

		System.out.printf("%c", a);

		/*
		 * int a = new Random().nextInt('Z' - 'A' + 1) + 'A';
		 * 
		 * System.out.printf((char)a);
		 */

	}// main
}
