import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableStatementDemo4 {
	public static void main(String[] args) throws SQLException{
		Connection conn = new DBConnection().getConnection();
		//String sql = "UPDATE student SET tot = 300, avg = 75.4, " + 
		//                    "grade = 'C' WHERE hakbun = '1104' ";
		Statement stmt = conn.createStatement(
				                             ResultSet.TYPE_SCROLL_SENSITIVE,
				                             ResultSet.CONCUR_UPDATABLE);
		String sql = "SELECT * FROM student ";
		ResultSet rs = stmt.executeQuery(sql);
		rs.absolute(3);
		//System.out.println(rs.getString("irum"));
		rs.updateInt(7, 300);   rs.updateDouble(8, 75.4);
		rs.updateString(9, "C");
		rs.updateRow();
		rs.beforeFirst();  //처음으로 이동 
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
