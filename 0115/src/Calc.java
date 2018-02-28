
public class Calc {
	public void calc(Student s) {
		int sum = s.getKor() + s.getEng() + s.getMat();
		s.setSum(sum);
		s.setAvg(s.getSum() / 3.0);
		char grade = (s.getAvg() <= 100 && s.getAvg() >= 90) ? 'A' : 
			                        (s.getAvg() < 90 && s.getAvg() >= 80) ? 'B' :
			                        	    (s.getAvg() < 80 && s.getAvg() >= 70) ? 'C' :
			                        	    	    (s.getAvg() < 70 && s.getAvg() >= 60) ? 'D' : 'F';
		s.setGrade(grade);
	}
}
