import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
	public static void main(String[] args) 
			throws MalformedURLException, IOException{
		URL url = new URL("https://www.naver.com");
		InputStream is = url.openStream();
		BufferedReader bis = new BufferedReader(
				                         new InputStreamReader(is));
		PrintWriter pw = new PrintWriter(
				                      new BufferedWriter(new FileWriter(
				                    		  new File("./naver.html"))));
		String line = null;
		while((line = bis.readLine()) != null) {
			pw.println(line);   pw.flush();
			//System.out.println(line);
		}
		System.out.println("Success");
		bis.close();   pw.close();
	}
}








