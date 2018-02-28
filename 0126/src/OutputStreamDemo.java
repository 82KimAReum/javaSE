import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void main(String[] args) throws IOException{
		OutputStream os = System.out;
		os.write(65);
		os.close();
	}
}
