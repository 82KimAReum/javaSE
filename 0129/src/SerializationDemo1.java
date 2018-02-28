import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class SerializationDemo1 {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream
				                                  (new FileInputStream(
				                                		  new File("./date.ser")));
		Object obj = ois.readObject();
		Date before = (Date)obj;
		System.out.println(before.toString());
		ois.close();
	}
}
