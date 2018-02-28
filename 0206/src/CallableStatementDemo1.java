import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * DELIMITER //
 * CREATE PROCEDURE searchByHakbun
 * (IN  t_hakbun  CHAR(4))
 * BEGIN 
 *      SELECT hakbun, irum, kor, eng, mat, edp, tot, avg, grade
 *      FROM student
 *      WHERE hakbun = t_hakbun;
 * END //
 * DELIMITER ;
 */
public class CallableStatementDemo1 {
	public static void main(String[] args) throws SQLException {
		Connection conn = new DBConnection().getConnection();
		String sql = "{ call searchByHakbun(?) }";
		CallableStatement cstmt = conn.prepareCall(sql);
		cstmt.setString(1, "1101");
		ResultSet rs = cstmt.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getString("hakbun") + "\t");
			System.out.println(rs.getString("irum"));
		}
		DBClose.close(conn);
	}
}





