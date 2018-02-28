
public class ConstructorDemo1 {
	public static void main(String[] args) {
		Patient p = new Patient(25);     /*p.setAge(25);*/
	}
}
class Patient{
	private int age;
	
	public Patient(int age) {  System.out.println("나는 기본 생성자");}  
}


