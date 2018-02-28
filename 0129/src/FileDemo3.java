import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
	public static void main(String[] args) {
		File directory = new File("/home/instructor");
		File [] array = directory.listFiles();
		String pattern = "yyyy-MM-dd  aa hh:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		for(File f : array) {
			System.out.print(sdf.format(new Date(f.lastModified())));
			if(f.isDirectory())  System.out.print("\t\t" + "<DIR>");
			else if(f.isFile())  System.out.print("\t\t" + f.length());
			System.out.println("\t\t\t" + f.getName());
		}
	}
}
