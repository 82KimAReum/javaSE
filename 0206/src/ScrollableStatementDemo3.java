import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableStatementDemo3 {
	public static void main(String[] args) throws SQLException{
		Connection conn = new DBConnection().getConnection();
		/*String sql = "INSERT INTO student() VALUES(?,?,?)";
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);*/
		Statement stmt = conn.createStatement(
				                             ResultSet.TYPE_SCROLL_SENSITIVE,
				                             ResultSet.CONCUR_UPDATABLE);
		String sql = "SELECT * FROM student ";
		ResultSet rs = stmt.executeQuery(sql);
		rs.moveToInsertRow();   //Insert할 레코드위치로 이동 
		rs.updateString(1, "1105");   rs.updateString(2, "사랑해");
		rs.updateInt(3, 87);    rs.updateInt(4, 87);
		rs.updateInt(5, 53);    rs.updateInt(6, 55);
		rs.insertRow();            //레코드 인서트 후
		rs.beforeFirst();           //처음 레코드 위로 이동 
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
