import java.io.IOException;
import java.io.RandomAccessFile;
//한글이 제대로 처리되나요? 
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		String file = "./src/RandomAccessFileDemo.java";
		RandomAccessFile raf = new RandomAccessFile(file, "r");
		while(raf.getFilePointer() < raf.length()) {
			System.out.println(Util.entoutf8(raf.readLine()));
		}
	}
}
