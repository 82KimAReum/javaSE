package com.swacademy.libs.controller;

import java.sql.SQLException;

import com.swacademy.libs.model.PatientsDAO;
import com.swacademy.libs.model.PatientsVO;

public class InsertController {
	public static int insert(PatientsVO p) {
		int row = 0;
		try {
			row = PatientsDAO.insert(p);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return row;
	}
}
