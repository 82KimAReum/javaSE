import java.util.Calendar;
import java.util.GregorianCalendar;
public class AbstractDemo {
	public static void main(String[] args) {
		Demo d = new DemoJasik();     d.display();
		Calendar cal = new GregorianCalendar();
	}
}
abstract class Demo{
	public void display() { System.out.println("나는 정상적인 메소드"); }
}
class DemoJasik extends Demo{}