import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MapDemo2 {
	public static void main(String[] args) throws IOException{
		Properties info = new Properties();
		info.load(new FileInputStream(new File("dbinfo.properties")));
		System.out.println("db driver = " + info.getProperty("DBDRIVER"));
		System.out.println("db url = " + info.getProperty("DBURL"));
		System.out.println("db user = " + info.getProperty("DBUSER"));
		System.out.println("db password = " + info.getProperty("DBPWD"));
	}
}






