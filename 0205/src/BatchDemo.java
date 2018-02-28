import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDemo {
	public static void main(String[] args) throws SQLException {
		Connection conn = new DBConnection().getConnection();
		/*Statement stmt = conn.createStatement();
		String sql = "CREATE TABLE member(" +
		                    "empno     SMALLINT  PRIMARY KEY, " +
				            "name       VARCHAR(20)    NOT NULL, " + 
		                    "hiredate    DATE  NOT NULL, " +
				            "salary       INT" + 
		                    ")";
		stmt.executeUpdate(sql);
		System.out.println("Success");
		if(stmt != null) stmt.close();*/
		String sql = "INSERT INTO test.member(empno, name, hiredate) ";
		sql += "VALUES(?,?,?) ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int [] empnoArray = {1101, 1102, 1103, 1104, 1105};
		String [] nameArray = {"이미자", "조용필", "설운도", 
				                                           "소녀시대", "워너원"};
		for(int i = 0 ; i < 5 ; i++) {
			pstmt.setInt(1, empnoArray[i]);
			pstmt.setString(2, nameArray[i]);
			pstmt.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			pstmt.addBatch();
		}
		int [] array = pstmt.executeBatch();  
		if(array.length == 5)  System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		DBClose.close(conn);
	}
}



