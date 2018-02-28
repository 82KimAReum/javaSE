//Utility Class
class Util {
	//진료코드를 통해 진찰부서를 얻어가는 메소드 
	static String getDepartment(String code){
		String department = null;
		switch(code){
			case "MI" : department = "외과"; break;
			case "NI" : department = "내과"; break;
			case "SI" : department = "피부과"; break;
			case "TI" : department = "소아과"; break;
			case "VI" : department = "산부인과"; break;
			case "WI" : department = "비뇨기과"; break;
		}
		return department;
	}
	//나이를 통해 진찰비를 얻어가는 메소드 
	static int getJinchalFee(int age){
		int jinchalfee = 0;
		switch(age / 10){
			case 0 : jinchalfee = 7000; break;
			case 1 : jinchalfee = 5000; break;
			case 2 : jinchalfee = 8000; break;
			case 3 : jinchalfee = 7000; break;
			case 4 : jinchalfee = 4500; break;
			default : jinchalfee = 2300; 
		}
		return jinchalfee;
	}
	//입원일수에 대한 하루 입원비 계산 
	static int getIpwonFeePerDay(int day){
		if(day > 3) return 25000;
		else return 30000;
	}
	//입원일수를 통해 할인율을 얻어가는 메소드 
	static double getRate(int days){
		double rate = 0.0;
		if(days < 10) rate = 1.00;
		else if(days >= 10 && days < 15) rate = 0.85;
		else if(days >= 15 && days < 20) rate = 0.80;
		else if(days >= 20 && days < 30) rate = 0.77;
		else if(days >= 30 && days < 100) rate = 0.72;
		else rate = 0.68;
		return rate;
	}
}
