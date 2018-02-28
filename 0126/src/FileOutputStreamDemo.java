import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		String path = "/home/instructor/Desktop/myfile.dat";
		FileOutputStream fos = null;
		fos = new FileOutputStream(path);
		fos.write("Hello, World".getBytes());
		fos.write("\n".getBytes());
		fos.write("안녕하세요".getBytes());
		System.out.println("Success");
		fos.close();
	}
}






