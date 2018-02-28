import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableStatementDemo {
	public static void main(String[] args) throws SQLException{
		Connection conn = new DBConnection().getConnection();
		Statement stmt = conn.createStatement(
				                          ResultSet.TYPE_FORWARD_ONLY,
				                          ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery(
				                             "SELECT hakbun, irum FROM student");
		rs.next();    rs.next();    rs.next();     rs.previous();   rs.previous(); //1102
		//rs.first();     System.out.println(rs.getString("hakbun"));   1101
		//rs.last();       System.out.println(rs.getString("hakbun"));  1104
		//rs.absolute(3);   System.out.println(rs.getString("hakbun"));   //1103
		rs.relative(-1);     System.out.println(rs.getString("hakbun"));
		rs.updateRow();
		DBClose.close(conn);
	}
}




