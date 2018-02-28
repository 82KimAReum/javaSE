import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataDemo {
	public static void main(String[] args) throws SQLException {
		Connection conn = new DBConnection().getConnection();
		CallableStatement cstmt = conn.prepareCall("{call aaa()}");
		ResultSet rs = cstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		//System.out.println("컬럼 갯수 : " + rsmd.getColumnCount());
		for(int i = 1 ; i <= rsmd.getColumnCount() ; i++) {
			System.out.print(i + " --> " + rsmd.getColumnName(i));
			//System.out.print("(" + rsmd.getColumnType(i) + ")");
			System.out.print(" " + rsmd.getColumnTypeName(i));
			System.out.println(" " + rsmd.getColumnDisplaySize(i));
		}
		if(cstmt != null) cstmt.close();
		DBClose.close(conn);
	}
}







