import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableStatementDemo2 {
	public static void main(String[] args) throws SQLException{
		Connection conn = new DBConnection().getConnection();
		/*String sql = "DELETE FROM student " +
		                    "WHERE irum = '정다워' ";
		Statement stmt = conn.createStatement();
		int row = stmt.executeUpdate(sql);
		if(row == 1) System.out.println("Success");
		else System.out.println("Failure");*/
		Statement stmt = conn.createStatement(
				                             ResultSet.TYPE_SCROLL_SENSITIVE,
				                             ResultSet.CONCUR_UPDATABLE);
		String sql = "SELECT * FROM student ";
		ResultSet rs = stmt.executeQuery(sql);
		rs.absolute(2);
		rs.deleteRow();    //2번째 레코드 삭제 
		rs.beforeFirst();    //첫번째 레코드 위로 이동
		//System.out.println(rs.getString("irum"));
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
