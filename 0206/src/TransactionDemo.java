import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//TCL : Transaction Control Language, COMMIT, ROLLBACK
public class TransactionDemo {
	public static void main(String[] args) {
		Connection conn = new DBConnection().getConnection();
		Statement stmt = null;
		try {
			conn.setAutoCommit(false);
			String sql = "DELETE FROM student";
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			conn.commit();
			System.out.println("Delete Success");
		}catch(SQLException ex) {
			ex.printStackTrace();
			try {
				conn.rollback();
			}catch(SQLException e) {  e.printStackTrace(); }
		}finally {
			try {
				if(stmt != null) stmt.close();
			}catch(SQLException ex) {}
			DBClose.close(conn);
		}
	}
}






