import java.util.Calendar;

//2. 
public class DateTimeDemo1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR) + ", " + 
		       cal.get(Calendar.MONTH) + 1 + ", " + 
		       //cal.get(Calendar.DAY_OF_MONTH));
		       cal.get(Calendar.DATE));
		  
	}
}





