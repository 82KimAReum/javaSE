import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class CountryDAO {
	public static Vector<String> selectCountryCode() 
			throws SQLException{
		Connection conn = new DBConnection().getConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT DISTINCT countrycode FROM city";
		ResultSet rs = stmt.executeQuery(sql);
		Vector<String> vector = new Vector<String>(1,1);
		while(rs.next()) vector.addElement(rs.getString("countrycode"));
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}
	public static ResultSet selectCity(String countrycode) 
			throws SQLException{
		Connection conn = new DBConnection().getConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT id, name, countrycode, district, population " + 
				            "FROM city " +
				            "WHERE countrycode = '" + countrycode + "' ";
		ResultSet rs = stmt.executeQuery(sql);
		if(stmt != null) stmt.close();
		DBClose.close(conn);
		return rs;
	}
}






