package com.swacademy.libs.controller;

import java.sql.SQLException;

import com.swacademy.libs.model.EmployeeDAO;
import com.swacademy.libs.model.EmployeeVO;

public class InsertController {
	public static int insert(EmployeeVO emp) {
		int row = 0;
		try {
			row = EmployeeDAO.insert(emp);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return row;
	}
}
