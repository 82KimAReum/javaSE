import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		System.out.println("Path Separator -> " + 
	                                           System.getProperty("path.separator"));
		System.out.println("Path Separator -> " + File.pathSeparator);
		System.out.println("Separator -> " + 
                System.getProperty("file.separator"));
		System.out.println("Separator -> " + File.separator);
	}
}
