package Ex1_Byte_stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ex3_BufferedInput {
	public static void main(String[] args) {

		// 입력 : a
		// a의 갯수 :2
		// 입력 : 홍
		// 홍의 갯수 : 2

		Scanner sc = new Scanner(System.in);

		File f = new File("C:/IOtest/test.txt");
		byte[] b_read = new byte[(int) f.length()];
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		String content = "";

		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);

			bis.read(b_read);

			content = new String(b_read);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {

				if (bis != null)
					bis.close();

				if (fis != null)
					fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		System.out.println("입력 :");
		String input = sc.next();
		int count = 0;

		// String s = ""+content.charAt(0);
		char s = input.charAt(0);

		for (int i = 0; i < content.length(); i++) {
			if (s == content.charAt(i)) {
				count++;
			}
		}
		System.out.printf("%s의 갯수 : %d개\n", input, count);

	}// main
}
