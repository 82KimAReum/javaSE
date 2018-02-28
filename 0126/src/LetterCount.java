import java.io.FileInputStream;
import java.io.IOException;

public class LetterCount {
	public static void main(String[] args) throws IOException{
		String file = "./koreaherald.dat";  int su = 0;
		FileInputStream fis = new FileInputStream(file);
		int [] array = new int[52];
		while((su = fis.read()) > 0) {
			if(su >= 65 && su <= 90) array[su-65]++;
			else if(su >= 97 && su <= 122) array[su-71]++;
		}
		display(array);
		fis.close();
	}
	static void display(int [] array) {
		int count = 0;
		for(int i = 0 ; i < 26 ; i++) {
			System.out.print((char)(i + 65) + "=" + array[i] + "\t\t");
			count++;
			if(count % 4 == 0) System.out.println();
		}
		System.out.println();  System.out.println(); count = 0;
		for(int i = 26 ; i < 52 ; i++) {
			System.out.print((char)(i + 71) + "=" + array[i] + "\t\t");
			count++;
			if(count % 4 == 0) System.out.println();
		}
	}
}






