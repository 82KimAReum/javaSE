import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableStatementDemo {
	public static void main(String[] args) throws SQLException{
		Connection conn = new DBConnection().getConnection();
		Statement stmt = conn.createStatement(
				                             ResultSet.TYPE_SCROLL_SENSITIVE,
				                             ResultSet.CONCUR_UPDATABLE);
		String sql = "SELECT * FROM student";
		ResultSet rs = stmt.executeQuery(sql);
		//rs.beforeFirst();
		rs.afterLast();
		while(rs.previous()) {
			System.out.println(rs.getString("hakbun"));
		}
		DBClose.close(conn);
	}
}
