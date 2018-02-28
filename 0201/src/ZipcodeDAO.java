import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import kr.co.bitcamp.libs.db.DBClose;
import kr.co.bitcamp.libs.db.DBConnection;

public class ZipcodeDAO {
	public static Vector<ZipcodeVO> select(String dongName) 
			throws SQLException{
		Connection conn = new DBConnection().getConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT zipcode, sido, gugun, dong, bunji     " + 
				            "FROM test.zipcode     " + 
				            "WHERE dong LIKE '%" + dongName + "%'     "; 
		ResultSet rs = stmt.executeQuery(sql);
		Vector<ZipcodeVO> vector = new Vector<ZipcodeVO>(1,1);
		if(!rs.next())  vector = null;
		else {
			do {
				String zipcode = rs.getString("zipcode");
				String sido = rs.getString("sido");
				String gugun = rs.getString("gugun");
				String dong = rs.getString("dong");
				String bunji = rs.getString("bunji");
				ZipcodeVO zip = new ZipcodeVO(zipcode, sido, gugun, dong, bunji);
				vector.addElement(zip);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}
}




