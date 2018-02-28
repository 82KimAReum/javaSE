package kr.co.bitcamp.libs.controller;

import java.sql.SQLException;

import kr.co.bitcamp.libs.model.StudentDAO;
import kr.co.bitcamp.libs.model.StudentVO;

public class InsertController {
	public static int insert(StudentVO s) {
		int row = 0;
		try{
			row = StudentDAO.insert(s);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return row;
	}
}






