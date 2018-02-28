import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); System.out.print("파일 경로 : ");
		String path = scan.nextLine();
		File file = new File(path);
		System.out.println("Path -> " + file.getPath());
		System.out.println("Absolute Path -> " + file.getAbsolutePath());
		try {
			System.out.println("Canonical Path -> " + file.getCanonicalPath());
		}catch(IOException ex) {}
	}
}
