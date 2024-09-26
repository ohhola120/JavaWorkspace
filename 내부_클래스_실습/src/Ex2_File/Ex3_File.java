package Ex2_File;

import java.io.File;
import java.io.FileInputStream;

public class Ex3_File {
	public static void main(String[] args) {
		String path = "C:/java_nsj/work/Ex_0819/src/ex1_first/Ex1_print.java";
		File f = new File(path);
		FileInputStream fis = null;
		byte[] b_read = new byte[(int) f.length()];

		try {
			fis = new FileInputStream(f);

			fis.read(b_read);

			String res = new String(b_read);

			System.out.println(res.trim());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}// main

}
