package Ex2_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Ex1_FileInput {
public static void main(String[] args) {
	
	//...Stream : 바이트 기반의 스트림(1byte)
	//Reader, ...Weiter : 캐릭터 기반의 스트림(2byte)
	String path = "C:/IOtest/test.txt";
	File f =new File(path);
	
	if(f.exists()) {
		
		FileInputStream fis =null;
		try {
			 fis = new FileInputStream(f);
			int code =0;
			//접근한 path경로에서 더 이상 읽을 게 없을 떄까지(EOF : -1)
			//반복문을 수행한다
			while((code = fis.read())!=-1) {
				
				char ch = (char)code;
				System.out.print(ch);
				
			}
			//사용을 완료한 스트림은 반드시 닫아줘야 한다
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
}
