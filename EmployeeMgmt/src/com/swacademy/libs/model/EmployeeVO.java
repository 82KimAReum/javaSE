package com.swacademy.libs.model;

public class EmployeeVO {
	private String empno;   //사원번호코드
	private String name;     //사원이름
	private int giboncode;          //기본급코드
	private int nighthour;    //야간시간
	private int family;          //가족수
	private String dname;   //부서이름
	private int gibon;      //기본급
	private int hobonus;   //호급수당
	private int familybonus;    //가족수당
	private int nightbonus;     //야간수당
	private int sum;                 //총금액
	private int salary;              //실수령액
	
	public EmployeeVO() {}
	public EmployeeVO(String empno, String name, int giboncode, int nighthour, int family) {
		this.empno = empno;
		this.name = name;
		this.giboncode = giboncode;
		this.nighthour = nighthour;
		this.family = family;
	}
	
	public String getEmpno() {
		return empno;
	}
	
	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGiboncode() {
		return giboncode;
	}

	public void setGiboncode(int giboncode) {
		this.giboncode = giboncode;
	}

	public int getNighthour() {
		return nighthour;
	}

	public void setNighthour(int nighthour) {
		this.nighthour = nighthour;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getGibon() {
		return gibon;
	}

	public void setGibon(int gibon) {
		this.gibon = gibon;
	}

	public int getHobonus() {
		return hobonus;
	}

	public void setHobonus(int hobonus) {
		this.hobonus = hobonus;
	}

	public int getFamilybonus() {
		return familybonus;
	}

	public void setFamilybonus(int familybonus) {
		this.familybonus = familybonus;
	}

	public int getNightbonus() {
		return nightbonus;
	}

	public void setNightbonus(int nightbonus) {
		this.nightbonus = nightbonus;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString(){
		return String.format("%6s%7s%,10d%,10d%,10d%,10d%,12d%,12d",
			this.empno,this.dname, this.gibon, this.hobonus,
			this.familybonus, this.nightbonus, this.sum, this.salary);
	}
	
}
