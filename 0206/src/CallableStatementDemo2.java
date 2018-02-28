import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * DELIMTER //
 * CREATE PROCEDURE insertStudent
 * (t_hakbun   CHAR(4), t_irum   VARCHAR(20), 
 *  t_kor    SMALLINT, t_eng    SMALLINT, 
 *  t_mat    SMALLINT, t_edp    SMALLINT)
 *  BEGIN
 *  	INSERT INTO student (hakbun, irum, kor, eng, mat, edp)
 *     VALUES (t_hakbun, t_irum, t_kor, t_eng, t_mat, t_edp);
 *  END //
 * DELIMITER ;
 */
public class CallableStatementDemo2 {
	public static void main(String[] args) throws SQLException {
		Connection conn = new DBConnection().getConnection();
		String sql = "{ call insertStudent(?,?,?,?,?,?)}";
		CallableStatement cstmt = conn.prepareCall(sql);
		//1106     튼튼이     98     97     93    88
		cstmt.setString(1, "1106");   cstmt.setString(2, "Michael");
		cstmt.setInt(3, 98);                cstmt.setInt(4, 97);
		cstmt.setInt(5, 93);                cstmt.setInt(6, 88);
		int row = cstmt.executeUpdate();
		if(row == 1) System.out.println("Success");
		else System.out.println("Failure");
		DBClose.close(conn);
	}
}








