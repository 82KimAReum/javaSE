import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("읽고 싶은 파일의 경로 : ");
		String path = scan.nextLine();
		File file = new File(path);
		Scanner scan1 = null;
		try{
			scan1 = new Scanner(file);
			for(int i = 0 ; i < 3 ; i++) 
				System.out.println(scan1.nextLine());
		}catch(FileNotFoundException ex) {
			System.out.println("File Not Found");
		}
	}
}








