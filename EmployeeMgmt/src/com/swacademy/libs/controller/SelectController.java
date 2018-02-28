package com.swacademy.libs.controller;

import java.sql.SQLException;
import java.util.Vector;

import com.swacademy.libs.model.EmployeeDAO;
import com.swacademy.libs.model.EmployeeVO;

public class SelectController {
	public static int getGibon(int gibon) {
		int defaultbonus = 0;
		try {
			defaultbonus = EmployeeDAO.getDefaultBonus(gibon);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return defaultbonus;
	}
	public static int getNightBonus(int night) {
		int nightbonus = 0;
		try {
			nightbonus = EmployeeDAO.getNightBonus(night);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return nightbonus;
	}
	public static int getHobongBonus(int hobong) {
		int hobongbonus = 0;
		try {
			hobongbonus = EmployeeDAO.getHobongBonus(hobong);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return hobongbonus;
	}
	public static String getDepartment(String code) {
		String dname = null;
		try {
			dname = EmployeeDAO.getDepartmentName(code);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return dname;
	}
	public static Vector<EmployeeVO> getEmployees() {
		Vector<EmployeeVO> vector = null;
		try {
			vector = EmployeeDAO.getEmployees();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return vector;
	}
}
