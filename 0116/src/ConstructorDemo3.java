import java.util.Calendar;
public class ConstructorDemo3 {
	public static void main(String[] args) {
		//Test t = new Test();
		Calendar cal = new Calendar();
	}
}
class Test{
	private double avg;
	private Test() { System.out.println("방금 객체가 생성됐습니다.");}
}