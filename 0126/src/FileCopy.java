import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//java FileCopy 원본  타겟
public class FileCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		byte [] buffer = new byte[512];   int count = 0;
		while((count = fis.read(buffer)) > 0) {
			fos.write(new String(buffer, 0, count).getBytes());
		}
		System.out.println("File Copy Success");
		fis.close();   fos.close();
	}
}






