package Ex2_File;

import java.io.File;
import java.io.FileInputStream;

public class Ex4_FileInput {
public static void main(String[] args) {
	
	//text.txt의 내용을 읽어 숫자들의 합만 출력
	//----------
	//결과 10
	
	String path ="C:/IOtest/test.txt";
	File f = new File(path);
	int code = 0;
	FileInputStream fis = null;
	
	try {
		fis = new FileInputStream(f);
		
		int sum = 0;
		
		while((code = fis.read()) != -1) {
			
			char ch =(char)code;
			if(ch >='0' && ch <= '9') {
			String s = ""+ch;
			sum+= Integer.parseInt(s);
//			String s = "" + (char)code;
//			try {
//				sum += Integer.parseInt(s);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
			}
		}//while
		
		System.out.println("결과 : " + sum);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
	
	
	
	
}//main
}
