import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo1 {
	public static void main(String[] args) {
		byte [] buffer = new byte[256];
		InputStream is = System.in;
		int count = 0;
		System.out.print("어느 계절을 좋아하시나요 ? : ");
		try {
			count = is.read(buffer);
			String season = new String(buffer, 0, count);
			System.out.println("season = " + season);
		}catch(IOException ex) {}
	}
}







