package Ex1_Byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_ByteStream {
public static void main(String[] args) {
	
	FileInputStream fis =null;
	
	byte[] read = new byte[100];
	byte[] consol = new byte[100];
	
	System.out.println("경로 : ");
	try {
		System.in.read(consol);
		String path = new String(consol).trim();
		
		File f = new File(path);
		
		fis = new FileInputStream(f);
		
		fis.read(read);
		
		String res = new String(read);
		
		System.out.println(res);
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			if(fis != null) {
				fis.close();
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	
}//main
}
