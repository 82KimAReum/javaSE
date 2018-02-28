import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * DELIMITER //
 * CREATE PROCEDURE aaa()
 * BEGIN 
 *      SELECT hakbun, irum, kor, eng, mat, edp, tot, avg, grade
 *      FROM student;
 * END //
 * DELIMITER ;
 */
public class CallableStatementDemo {
	public static void main(String[] args) throws SQLException {
		Connection conn = new DBConnection().getConnection();
		String sql = "{ call aaa() }";
		CallableStatement cstmt = conn.prepareCall(sql);
		ResultSet rs = cstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("hakbun"));
		}
		DBClose.close(conn);
	}
}





