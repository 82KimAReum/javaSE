
public class ClassDemo {
	public static void main(String[] args) {
		Student chulsu = new Student();
		//chulsu.kor = 90;
		chulsu.setKor(90);
		//System.out.println("kor = " + chulsu.kor);
		System.out.println("kor = " + chulsu.readKor());
	}
}
