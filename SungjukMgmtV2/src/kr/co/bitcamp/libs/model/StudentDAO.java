package kr.co.bitcamp.libs.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class StudentDAO {
	//1 : all success, 0 : no account,  -1 : password error
	public static int userCheck(String userid, String passwd) throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "SELECT passwd FROM user " + 
		                   "WHERE userid = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userid);
		ResultSet rs = pstmt.executeQuery();
		int result = 0;
		if(!rs.next()) {   //그런 아이디가 없다는 의미
			result = 0;
		}else {    //그런 아이디는 있다는 의미 
			if(passwd.trim().equals(rs.getString("passwd").trim())) {
				result = 1;
			}else result = -1;
		}
		if(rs != null) rs.close();   if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return result;
	}
	public static int insert(StudentVO s) throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "INSERT INTO student(hakbun, irum, kor, " +
		                    "eng, mat, edp, tot, avg, grade) " + 
				            "VALUES(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, s.getHakbun());
		pstmt.setString(2, s.getIrum());
		pstmt.setInt(3, s.getKor());
		pstmt.setInt(4, s.getEng());
		pstmt.setInt(5, s.getMat());
		pstmt.setInt(6, s.getEdp());
		pstmt.setInt(7, s.getSum());
		pstmt.setDouble(8, s.getAvg());
		pstmt.setString(9, String.valueOf(s.getGrade()));
		int row = pstmt.executeUpdate();
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return row;
	}
	public static Vector<StudentVO> select() throws SQLException {
		Connection conn = new DBConnection().getConnection();
		String sql = "SELECT hakbun, irum, kor, eng, mat, edp, tot, avg, grade " +
		                    "FROM student";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		Vector<StudentVO> vector = new Vector<StudentVO>(1,1);
		if(!rs.next())   vector = null;
		else {   //학생이 있다면 
			do {
				StudentVO s = new StudentVO(
						rs.getString("hakbun"), rs.getString("irum"), 
						rs.getInt("kor"), rs.getInt("eng"), 
						rs.getInt("mat"), rs.getInt("edp"));
				s.setSum(rs.getInt("tot"));  s.setAvg(rs.getDouble("avg"));
				String grade = rs.getString("grade");
				s.setGrade(grade.charAt(0));
				vector.addElement(s);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return vector;
	}
}




