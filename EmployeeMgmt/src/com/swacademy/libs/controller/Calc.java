package com.swacademy.libs.controller;
import java.util.Vector;

import com.swacademy.libs.model.EmployeeVO;

public class Calc {
	private EmployeeVO emp;
	public Calc(EmployeeVO emp) {
		this.emp = emp;
	}
	public void calc() {
		String empno = emp.getEmpno();
		String dname = SelectController.getDepartment(emp.getEmpno().substring(0, 1));  //부서이름
		int hobonus = SelectController.getHobongBonus(Integer.parseInt(emp.getEmpno().substring(1, 2))); //호급수당
		int familybonus = emp.getFamily() * 7000;   //가족수당
		int nightbonus = SelectController.getNightBonus(emp.getNighthour());     //야간수당
		int gibon = SelectController.getGibon(emp.getGiboncode());                         //기본급
		int sum = hobonus + gibon + nightbonus + familybonus; //총계
		double tax = hobonus * 0.1;    //세금
		int salary = sum - (int)tax;       //실수령액
		emp.setDname(dname);
		emp.setGibon(gibon);
		emp.setHobonus(hobonus);
		emp.setFamilybonus(familybonus);
		emp.setNightbonus(nightbonus);
		emp.setSum(sum);
		emp.setSalary(salary);
	}
}
