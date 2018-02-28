import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDemo2 {
	public static void main(String[] args) throws IOException {
		ArrayList<Student> array = new ArrayList<Student>(3);
		array.add(new Student("이미자", 25, 47.4));
		array.add(new Student("조용필", 65, 67.4));
		array.add(new Student("임윤아", 25, 50.4));
		ObjectOutputStream oos = new ObjectOutputStream(
				                                   new FileOutputStream(new File("./array.ser")));
		oos.writeObject(array);
		System.out.println("Success");
		oos.close();
	}
}
