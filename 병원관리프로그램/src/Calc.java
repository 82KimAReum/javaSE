import java.util.Vector;

class Calc {
	private Vector<Patients> vector;
	
	Calc(Vector<Patients> vector){
		this.vector = vector;
	}
	
	void calc(){
		for(int i = 0 ; i < this.vector.size() ; i++){
			Patients p = this.vector.elementAt(i);
			//진찰부서
			String department = Util.getDepartment(p.getCode());
			p.setDepartment(department);
			//진찰비
			int fee = Util.getJinchalFee(p.getAge());
			p.setJinchalfee(fee);
			//입원비
			int days = p.getDays();  //입원일수
			int totalIpwonFee = Util.getIpwonFeePerDay(days) * days; //총입원비
			double rate = Util.getRate(days);   //입원일수대비 할인비율
			int ipwonFee = (int)(totalIpwonFee * rate);  //입원비 
			p.setIpwonfee(ipwonFee);
			int sum = fee + ipwonFee;     //진료비
			p.setSum(sum);
		}
	}
}
