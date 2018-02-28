class Patients {
	private int no;   //번호
	private String code;  //진료코드
	private int days;      //입원일수
	private int age;    //나이
	private String department;    //진료부서
	private int jinchalfee;           //진찰비
	private int ipwonfee;            //입원비
	private int sum;                    //진료비
	
	Patients(int no, String code, int days, int age) {
		this.no = no;    	this.code = code;    
		this.days = days;      this.age = age;
	}
	String getDepartment() {
		return department;
	}
	void setDepartment(String department) {
		this.department = department;
	}
	int getJinchalfee() {
		return jinchalfee;
	}
	void setJinchalfee(int jinchalfee) {
		this.jinchalfee = jinchalfee;
	}
	int getIpwonfee() {
		return ipwonfee;
	}
	void setIpwonfee(int ipwonfee) {
		this.ipwonfee = ipwonfee;
	}
	int getSum() {
		return sum;
	}
	void setSum(int sum) {
		this.sum = sum;
	}
	int getNo() {
		return no;
	}
	String getCode() {
		return code;
	}
	int getDays() {
		return days;
	}
	int getAge() {
		return age;
	}
}
