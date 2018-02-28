import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		String [] array = {"JavaSE", "Oracle", "Servlet", "JSP", "Spring", "Oracle"};
		HashSet<String> hashset = new HashSet<String>();
		TreeSet<String> treeset = new TreeSet<String>();
		for(String str : array)  {
			hashset.add(str);    treeset.add(str);
		}
		System.out.println("treeset  --> " + treeset);
		System.out.println("hashset --> " + hashset);
		//System.out.println(treeset.size());
		//System.out.println(hashset.size());
		Iterator<String> iters = hashset.iterator();
		while(iters.hasNext()) {
			System.out.println(iters.next());
		}
		
		
		
		
		
		
	}
}
