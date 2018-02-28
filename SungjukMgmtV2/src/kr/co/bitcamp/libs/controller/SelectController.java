package kr.co.bitcamp.libs.controller;

import java.sql.SQLException;
import java.util.Vector;

import kr.co.bitcamp.libs.model.StudentDAO;
import kr.co.bitcamp.libs.model.StudentVO;

public class SelectController {
	public static int userCheck(String userid, String passwd) {
		int result = 0;
		try {
			result = StudentDAO.userCheck(userid, passwd);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return result;
	}

	public static Vector<StudentVO> select() {
		Vector<StudentVO> vector = null;
		try {
			vector = StudentDAO.select();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return vector;
	}
}




