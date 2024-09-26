package Ex1_File_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex3_BufferedReader {
public static void main(String[] args) {
	
	File f = new File("C:/IOtest/test.txt");
	FileReader fr = null;
	BufferedReader br = null;
	
	String msg = "";
	
	try {
		
		fr = new FileReader(f);
		br = new BufferedReader(fr);
		//일겅올 내용을 줄 단위로 읽어올 수 있다
		while((msg = br.readLine())!= null) {
			System.out.println(msg);
		}//while
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		try {
			
			if(br != null)
			br.close();
			if(fr != null)
				fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
}//main
}
