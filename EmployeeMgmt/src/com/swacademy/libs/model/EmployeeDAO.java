package com.swacademy.libs.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class EmployeeDAO {
	public static int insert(EmployeeVO emp) throws SQLException{
		int row = 0;
		Connection conn = new DBConnection().getConnection();
		String sql = "INSERT INTO employee VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, emp.getEmpno());
		pstmt.setString(2, emp.getName());
		pstmt.setInt(3, emp.getGiboncode());
		pstmt.setInt(4, emp.getNighthour());
		pstmt.setInt(5, emp.getFamily());
		pstmt.setString(6, emp.getDname());
		pstmt.setInt(7, emp.getGibon());
		pstmt.setInt(8, emp.getHobonus());
		pstmt.setInt(9, emp.getFamilybonus());
		pstmt.setInt(10, emp.getNightbonus());
		pstmt.setInt(11, emp.getSum());
		pstmt.setInt(12, emp.getSalary());
		row = pstmt.executeUpdate();
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return row;
	}
	public static Vector<EmployeeVO> getEmployees() throws SQLException{
		Connection conn = new DBConnection().getConnection();
		String sql = "SELECT empno, name, dname, gibon, hobongbonus, familybonus, nightbonus, sum, salary " +
		                  "FROM employee ORDER BY empno ASC";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmployeeVO> vector = new Vector<EmployeeVO>(1,1);
		if(!rs.next()) vector = null;
		else {
			do {
				EmployeeVO e = new EmployeeVO();
				e.setEmpno(rs.getString("empno")); 
				e.setName(rs.getString("name"));
				e.setDname(rs.getString("dname"));
				e.setGibon(rs.getInt("gibon"));
				e.setHobonus(rs.getInt("hobongbonus"));
				e.setFamilybonus(rs.getInt("familybonus"));
				e.setNightbonus(rs.getInt("nightbonus"));
				e.setSum(rs.getInt("sum"));
				e.setSalary(rs.getInt("salary"));
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();   if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}
	public static String getDepartmentName(String code) throws SQLException{
		//부서코드로 부서이름 조회하기
		Connection conn = new DBConnection().getConnection();
		String sql = "SELECT dname FROM department WHERE code = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,  code);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		String dname = rs.getString("dname");
		if(rs != null) rs.close();   if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return dname;
	}
	public static int getHobongBonus(int hobong) throws SQLException{
		//호급수당코드로 호급수당 조회하기
		Connection conn = new DBConnection().getConnection();
		String sql = "SELECT money FROM hobongbonus WHERE id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,  hobong);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		int money = rs.getInt("money");
		if(rs != null) rs.close();   if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return money;
	}
	public static int getNightBonus(int night) throws SQLException{
		//야간수당코드로 야간수당값 조회하기
		Connection conn = new DBConnection().getConnection();
		String sql = "SELECT money FROM nightbonus WHERE id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,  night);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		int money = rs.getInt("money");
		if(rs != null) rs.close();   if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return money;
	}
	public static int getDefaultBonus(int gibon) throws SQLException{
		//기본급으로 기본급 수당 조회하기
		Connection conn = new DBConnection().getConnection();
		String sql = "SELECT money FROM defaultbonus WHERE id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,  gibon);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		int money = rs.getInt("money");
		if(rs != null) rs.close();   if(pstmt != null) pstmt.close();
		DBClose.close(conn);
		return money;
	}
}
