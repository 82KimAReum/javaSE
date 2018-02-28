package com.swacademy.libs.controller;

import java.sql.SQLException;
import java.util.Vector;

import com.swacademy.libs.model.PatientsDAO;
import com.swacademy.libs.model.PatientsVO;

public class SelectController {
	public static Vector<PatientsVO> select(){
		Vector<PatientsVO> vector = null;
		try {
			vector = PatientsDAO.select();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return vector;
	}
}
