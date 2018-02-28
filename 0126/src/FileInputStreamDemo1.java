import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//한글이 제대로 나오나요?
public class FileInputStreamDemo1 {
	public static void main(String[] args) {
		String path = "./src/FileInputStreamDemo1.java";
		FileInputStream fis = null;
		byte [] buffer = new byte[20];    
		int count = 0;
		try {
			fis = new FileInputStream(path);
			while((count = fis.read(buffer)) > 0){
				System.out.print(new String(buffer, 0, count));
			}
		}catch(FileNotFoundException ex) {
			System.out.println("File Not Found");
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				fis.close();
			}catch(IOException ex) {}
		}
	}
}









