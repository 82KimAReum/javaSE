import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBBean {
	private final String driverName = "org.sqlite.JDBC";
	private final String jdbcUrl = "jdbc:sqlite:/home/instructor/Sqlite3/test.db";
	
	public Connection getConnection() throws SQLException {
		try {
			Class.forName(this.driverName);
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return DriverManager.getConnection(this.jdbcUrl);
	}
}







