/*
 * this의 3가지 용법
 * 1)this.(나의)      2) this      3) this()
 */
public class ThisDemo {
	public static void main(String[] args) {
		ThisDemo td = new ThisDemo();
		System.out.println("ThisDemo's addrss = " + td);
		td.display();
		//Student younghee = new Student();
		//younghee.setKor(90);
		//System.out.println("kor = " + younghee.getKor());
	}
	void display() {
		System.out.println("This's address = " + this);
	}
}




