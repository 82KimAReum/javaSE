import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class JDBCDemo {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		//1.1. Driver loading
		Class.forName("org.mariadb.jdbc.Driver");
		//1.2. Driver loading
		org.sqlite.JDBC sqlite = new org.sqlite.JDBC();
		DriverManager.registerDriver(sqlite);
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		while(drivers.hasMoreElements()) {
			Driver driver = drivers.nextElement();
			System.out.println(driver);
		}
		System.out.println("SQLite Driver 해제");
		DriverManager.deregisterDriver(sqlite);
		drivers = DriverManager.getDrivers();
		while(drivers.hasMoreElements()) {
			Driver driver = drivers.nextElement();
			System.out.println(driver);
		}
		//2.1. Database Connection
		String url = "jdbc:mariadb://192.168.56.1:3306/test";
		//Properties info = new Properties();
		//info.setProperty("user", "root");
		//info.setProperty("password", "javamariadb");
		//Connection conn = DriverManager.getConnection(url, info);
		//2.2. Database Connection
		Connection conn = DriverManager.getConnection(url, 
				                                 "root", "javamariadb");
		DatabaseMetaData dbmd = conn.getMetaData();
		System.out.println("Major Version = " + dbmd.getDatabaseMajorVersion());
		System.out.println("Minor Version = " + dbmd.getDatabaseMinorVersion());
		System.out.println("Product Name = " + dbmd.getDatabaseProductName());
		System.out.println("Product Version = " + dbmd.getDatabaseProductVersion());
	}
}





