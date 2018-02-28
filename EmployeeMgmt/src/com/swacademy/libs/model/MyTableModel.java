package com.swacademy.libs.model;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.swacademy.libs.controller.SelectController;

public class MyTableModel extends DefaultTableModel {
	private Vector<String> headVector;
	private Vector<Object> dataVector;
	public MyTableModel(){
		this.dataVector = new Vector<Object>(1,1);
		headVector = new Vector<String>(1,1);
		setData();
	}
	void setData(){
		String [] array = {"사원번호", "부서명", "기본급", "호급수당", "가족수당","야간수당", "총금액","실수령액"};
		for(String str : array) this.headVector.addElement(str);
		Vector<EmployeeVO> vector = SelectController.getEmployees();
		for(int i = 0 ; i < vector.size() ; i++) {
			EmployeeVO emp = vector.get(i);
			Vector<String> temp = new Vector<String>(1,1);
			temp.addElement(emp.getEmpno());
			temp.addElement(emp.getDname());
			temp.addElement(emp.getGibon() + "");
			temp.addElement(String.valueOf(emp.getHobonus()));
			temp.addElement(String.valueOf(emp.getFamilybonus()));
			temp.addElement(String.valueOf(emp.getNightbonus()));
			temp.addElement(String.valueOf(emp.getSum()));
			temp.addElement(String.valueOf(emp.getSalary()));
			dataVector.addElement(temp);
		}
		this.setDataVector(dataVector, headVector);
	}
	
}








