import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {
		String [] array = {"JavaSE", "Oracle", "Servlet", "JSP", "Spring", "Oracle"};
		Vector<String> vector = new Vector<String>(1,1);
		ArrayList<String> arrayList = new ArrayList<String>(1);
		for(String str : array) {
			vector.addElement(str);    arrayList.add(str);
		}
		for(int i = 0 ; i < vector.size() ; i++) {
			System.out.println(vector.elementAt(i) + ", " + arrayList.get(i));
		}
		Enumeration<String> enums = vector.elements();
		while(enums.hasMoreElements())
			System.out.println(enums.nextElement());
	}
}






