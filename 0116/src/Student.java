
public class Student {
	private String hakbun;
	private int kor;
	public Student() { System.out.println("나는 기본 생성자"); }
	public Student(String hakbun) { this.hakbun = hakbun; }
	public Student(int kor) { this.kor = kor; }
	public Student(String hakbun, int kor) { this.hakbun = hakbun;  this.kor = kor; }
	public void display() {
		System.out.println("hakbun = " + hakbun + ", kor = " + kor);
	}			
}
