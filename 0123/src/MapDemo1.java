import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class MapDemo1 {
	public static void main(String[] args) {
		//System.out.println(System.getProperty("user.name"));
		Properties info = System.getProperties();
		Set<Object> keys = info.keySet();
		Iterator<Object> iters = keys.iterator();
		while(iters.hasNext()) {
			String key = (String)iters.next();
			System.out.println(key + " --> " + info.getProperty(key));
		}
	}
}





