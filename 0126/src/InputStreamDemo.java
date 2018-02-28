import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) {
		InputStream is = System.in;
		String season = "";
		System.out.print("어느 계절을 좋아하세요 : ");
		int su;
		try{
			while(true) {
				su = is.read();     
				if((char)su == '\n' || su < 0) break;
				else season += (char)su;
			}
			System.out.println("season = " + season);
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}




