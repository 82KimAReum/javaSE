public class Demo {
	/*private boolean flag = true;
	private char grade = 'C';*/
	private boolean flag;
	private char grade;
	{  //Instance Initialization Block
		System.out.println("나는 초기화 블록이다.");
		flag = true;     grade = 'F';
	}
	public Demo() {
		System.out.println("나는 기본 생성자다.");
	}
	/*public Demo(boolean flag, char grade) {  //Constructor
		this.flag = flag;
		this.grade = grade;
	}*/
	//public void setFlag(boolean flag) { this.flag = flag; }
	//public void setGrade(char grade) {this.grade = grade; }
	public void display() {
		System.out.printf("flag = %b, grade = %c\n", 
				flag, grade);
	}
}
