import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		Date now = new Date();
		PrintStream fs = new PrintStream(
				                      new BufferedOutputStream(
				                    		  new FileOutputStream(new File("./date.ser"))));
		ObjectOutputStream oos = new ObjectOutputStream(fs);
		oos.writeObject(now);
		System.out.println("Success");
		oos.close();
		fs.close();
	}
}




