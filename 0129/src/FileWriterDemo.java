import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class FileWriterDemo {
	public static void main(String[] args) {
		String path = "/home/instructor/Desktop/file.dat";
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(path)));
			pw.printf("Today is %1$ty/%1$tm/%1$td\n", new Date());
			pw.printf("%s\n", "Hello, World");
			pw.printf("%s\n", "안녕하세요");
			pw.printf("kor = %5d, eng = %5d\n", 85, 90);
			pw.flush();
			System.out.println("Success");
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			pw.close();
		}
	}
}
