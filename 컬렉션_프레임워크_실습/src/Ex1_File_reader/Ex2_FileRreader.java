package Ex1_File_reader;

import java.io.File;
import java.io.FileReader;

public class Ex2_FileRreader {
	public static void main(String[] args) {

		// test.txt의 ㅐㄴ용을 읽어서
		// 알파벳 대문자의 갯수와, 소문자의 갯수를 출력
		// -----------
		// 대문자 : 3
		// 소문자 : 8

		File f = new File("C:/IOtest/test.txt");
		FileReader fr = null;

		try {
			fr = new FileReader(f);
			int a = 0;
			int A = 0;
			int code = 0;
			while ((code = fr.read()) != -1) {

				if (code >= 'A' && code <= 'Z') {
					A++;
				}
				if (code >= 'a' && code <= 'z')
					a++;
			}
			System.out.println("대문자 : " + A);
			System.out.println("소문자 : " + a);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}// main
}
