import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class URLDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a url : ");
		String str = scan.nextLine();
		URL url = null;
		try {
			url = new URL(str);
			System.out.println("protocol : " + url.getProtocol());
			System.out.println("hostname : " + url.getHost());
			System.out.println("port no. : " + url.getPort());
			System.out.println("default port no : " + url.getDefaultPort());
			System.out.println("file : " + url.getFile());
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
}





