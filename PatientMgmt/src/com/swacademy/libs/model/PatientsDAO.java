package com.swacademy.libs.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class PatientsDAO {
	public static int insert(PatientsVO p) throws SQLException {
		Connection conn = new DBConnection().getConnection();
		String sql = "INSERT INTO patient(no, code, days, age, department, jinchalfee, opwonfee, sum) "
				          + " VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, p.getNo());   pstmt.setString(2, p.getCode());
		pstmt.setInt(3, p.getDays());  pstmt.setInt(4, p.getAge());
		pstmt.setString(5, p.getDepartment());   pstmt.setInt(6, p.getJinchalfee());
		pstmt.setInt(7, p.getIpwonfee());   pstmt.setInt(8, p.getSum());
		int row = pstmt.executeUpdate();
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return row;
	}
	
	public static Vector<PatientsVO> select() throws SQLException{
		Connection conn = new DBConnection().getConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT no, department, jinchalfee, opwonfee, sum FROM patient";
		ResultSet rs = stmt.executeQuery(sql);
		Vector<PatientsVO> vector = new Vector<PatientsVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				PatientsVO p = new PatientsVO();
				p.setNo(rs.getInt("no"));
				p.setDepartment(rs.getString("department"));
				p.setJinchalfee(rs.getInt("jinchalfee"));
				p.setIpwonfee(rs.getInt("opwonfee"));  //입원비
				p.setSum(rs.getInt("sum"));
				vector.addElement(p);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}
}
