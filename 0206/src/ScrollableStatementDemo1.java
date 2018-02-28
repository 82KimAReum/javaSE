import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableStatementDemo1 {
	public static void main(String[] args) throws SQLException{
		Connection conn = new DBConnection().getConnection();
		Statement stmt = conn.createStatement(
				                             ResultSet.TYPE_SCROLL_SENSITIVE,
				                             ResultSet.CONCUR_UPDATABLE);
		String sql = "SELECT * FROM student " + 
				            "ORDER BY tot ASC";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getString("hakbun") + "\t");
			System.out.print(rs.getString("irum") + "\t");
			System.out.print(rs.getInt("tot") + "\t\t");
			System.out.print(rs.getDouble("avg") + "\t");
			System.out.println(rs.getString("grade"));
		}
		DBClose.close(conn);
	}
}
