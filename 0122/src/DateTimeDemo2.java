import java.util.Calendar;
import java.util.GregorianCalendar;

//3. 
public class DateTimeDemo2 {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(2018, 1, 9);
		System.out.println(cal.get(Calendar.YEAR) + ", " + 
			       cal.get(Calendar.MONTH) + ", " + 
			       //cal.get(Calendar.DAY_OF_MONTH));
			       cal.get(Calendar.DATE));
	}
}







