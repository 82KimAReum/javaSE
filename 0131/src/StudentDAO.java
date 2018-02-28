import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import kr.co.bitcamp.libs.db.DBClose;
import kr.co.bitcamp.libs.db.DBConnection;

public class StudentDAO {
	public static int insert(StudentVO s) throws SQLException{
		Connection conn = new DBConnection().getConnection();
		Statement stmt = conn.createStatement();
		StringBuffer sb = new StringBuffer("INSERT INTO student(");
		sb.append("hakbun, name, kor, eng, mat, edp)          ");
		sb.append("VALUES('" + s.getHakbun() + "', ");
		sb.append("'" + s.getIrum() + "', " + s.getKor());
		sb.append(", " + s.getEng() + ", " + s.getMat());
		sb.append(", " + s.getEdp() + ")");
		//System.out.println(sb.toString());
		int row = stmt.executeUpdate(sb.toString());
		if(stmt != null) stmt.close();
		DBClose.close(conn);
		return row;
	}
	public static Vector<StudentVO> selectAll() throws SQLException {
		Connection conn = new DBConnection().getConnection();
		Statement stmt = conn.createStatement();
		StringBuffer sb = new StringBuffer("SELECT ");
		sb.append("hakbun, name, kor, eng, mat, edp        ");
		sb.append("FROM student");
		ResultSet rs = stmt.executeQuery(sb.toString());
		Vector<StudentVO> vector = new Vector<StudentVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				StudentVO s = new StudentVO(rs.getString("hakbun"),
						rs.getString("name"), rs.getInt("kor"), rs.getInt("eng"),
						rs.getInt("mat"), rs.getInt("edp"));
				vector.addElement(s);
			}while(rs.next());
		}
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}
}




