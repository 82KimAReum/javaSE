import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		System.out.print("당신은 어느 계절을 좋아하시나요 ? : ");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String season = br.readLine();
		System.out.println("season = " + season);
	}
}






