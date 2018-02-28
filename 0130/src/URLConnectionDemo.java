import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class URLConnectionDemo {
	public static void main(String[] args) 
			throws MalformedURLException, IOException {
		URL url = new URL("http://www.webtime.co.kr");
		URLConnection conn = url.openConnection();
		//InputStream isw = conn.getInputStream();
		//System.out.println(conn.getContentType());
		Map<String, List<String>> headers = conn.getHeaderFields();
		Set<String> keys = headers.keySet();
		Iterator<String> iters = keys.iterator();
		while(iters.hasNext()) {
			String key = iters.next();
			System.out.print(key + " --> ");
			List<String> values = headers.get(key);
			for(String str : values) {
				System.out.print(str + ", ");
			}
			System.out.println();
		}
	}
}






