package com.swacademy.libs.model;
public class PatientsVO {
	private int no;   //번호
	private String code;  //진료코드
	private int days;      //입원일수
	private int age;    //나이
	private String department;    //진료부서
	private int jinchalfee;           //진찰비
	private int ipwonfee;            //입원비
	private int sum;                    //진료비
	
	public PatientsVO() {}
	public PatientsVO(int no, String code, int days, int age) {
		this.no = no;    	this.code = code;    
		this.days = days;      this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getJinchalfee() {
		return jinchalfee;
	}
	public void setJinchalfee(int jinchalfee) {
		this.jinchalfee = jinchalfee;
	}
	public int getIpwonfee() {
		return ipwonfee;
	}
	public void setIpwonfee(int ipwonfee) {
		this.ipwonfee = ipwonfee;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCode() {
		return code;
	}
	public int getDays() {
		return days;
	}
	public int getAge() {
		return age;
	}
}
