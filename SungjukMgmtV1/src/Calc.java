
public class Calc {
	private Student [] array;
	public Calc(Student [] array) {
		this.array = array;
	}
	public void calc() {
		for(int i = 0 ; i < this.array.length ; i++) {
			Student s = this.array[i];
			int sum = s.getKor() + s.getEng() + s.getMat() + s.getEdp();
			s.setSum(sum);
			s.setAvg(s.getSum() / 4.0);
			char grade = (s.getAvg() <= 100 && s.getAvg() >= 90) ? 'A' : 
			                        (s.getAvg() < 90 && s.getAvg() >= 80) ? 'B' :
			                        	    (s.getAvg() < 80 && s.getAvg() >= 70) ? 'C' :
			                        	    	    (s.getAvg() < 70 && s.getAvg() >= 60) ? 'D' : 'F';
			s.setGrade(grade);
		}
	}
}
