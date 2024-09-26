package Ex3_Object_Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class InfoWriter {

	public void writerInfo(User user) {
		String path = "C:/IOtest/User/" + user.getTell().trim() + "/save.sav";

		File dir1 = new File("C:/IOtest/User");

		if (!dir1.exists())
			dir1.mkdirs();

		File dir2 = new File(dir1, user.getTell().trim());
		if (!dir2.exists())
			dir2.mkdirs();

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {

			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);

			// User객체를 통쨰로 기록한다
			oos.writeObject(user);

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("기록 저장 실패");
		} finally {
			try {
				if (oos != null)
					oos.close();
				if (fos != null)
					fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
