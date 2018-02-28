import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//한글이 제대로 처리되나요? 
public class FileReaderDemo {
	public static void main(String[] args) {
		String file = "./src/FileReaderDemo.java";
		BufferedReader br = null;   String line = null;
		try{
			br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(IOException ex) {}
		}
	}
}
