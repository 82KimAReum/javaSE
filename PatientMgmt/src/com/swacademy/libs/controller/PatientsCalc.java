package com.swacademy.libs.controller;
import com.swacademy.libs.model.PatientsVO;
public class PatientsCalc {
	private PatientsVO p;   //환자 한명만 계산
	public PatientsCalc(PatientsVO p){
		this.p = p;
		calc();
	}
	private void calc(){
		String code = this.p.getCode();
		//환자의 진료부서설정 
		p.setDepartment(Utilities.getDepartment(code));  
		int defaultIpwonFee = 0;   //1일 입원비
		int days = this.p.getDays();  //입원날수
		if(days <= 3) defaultIpwonFee = 30000;
		else defaultIpwonFee = 25000;
		
		int totalIpwonFee = defaultIpwonFee * days;  //총입원비
		double rate = Utilities.getRate(days);  //할인율
		int ipwonFee = (int)(totalIpwonFee * rate);   //입원비
		
		//환자읭 입원비 설정
		p.setIpwonfee(ipwonFee);		
		int jinchalFee = Utilities.getJinchalFee(p.getAge());  //진찰비
		
		//환자의 진찰비 설정
		p.setJinchalfee(jinchalFee);
		int sum = jinchalFee + ipwonFee;  //진료비
		
		//환자의 진료비 설정
		p.setSum(sum);
	}
}
