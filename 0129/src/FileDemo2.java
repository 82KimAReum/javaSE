import java.io.File;
import java.util.Date;

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("./src/FileDemo2.java");
		long time = file.lastModified();
		Date date = new Date(time);
		System.out.println(time + " --> " + date);
	}
}
