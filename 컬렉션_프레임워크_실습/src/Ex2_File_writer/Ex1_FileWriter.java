package Ex2_File_writer;

import java.io.File;
import java.io.FileWriter;

public class Ex1_FileWriter {
public static void main(String[] args) {
	
	File f = new File("C:/IOtest/fileWriter.txt");
	FileWriter  fw = null;
	
	try {
		
		fw = new FileWriter(f, true);
		String str ="\n두번째 줄";
		fw.write(str);
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		try {
			if(fw!=null)
				fw.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	
	
}//main
}
