import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerializationDemo3 {
	public static void main(String[] args) throws IOException, 
	                                                                        ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(
				                                 new FileInputStream(new File("./array.ser")));
		ArrayList<Student> array = (ArrayList<Student>)ois.readObject();
		for(int i = 0; i < array.size() ; i++) {
			Student s = array.get(i);
			System.out.println(s);
		}
		ois.close();
	}
}
