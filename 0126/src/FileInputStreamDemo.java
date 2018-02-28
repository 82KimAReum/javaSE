import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("읽고 싶은 파일 경로 : ");
		String path = scan.next();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
			int su = 0;
			while(true) {
				su = fis.read();
				if(su < 0) break;
				else System.out.print((char)su);
			}
		}catch(FileNotFoundException ex) {
			System.out.println("File Not Found");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}






