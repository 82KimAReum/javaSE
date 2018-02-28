import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
//4. 
public class DateTimeDemo3 {
	public static void main(String[] args) {
		DateFormat df = 
				DateFormat.getDateTimeInstance(DateFormat.FULL, 
						                                              DateFormat.LONG,
						                                              Locale.FRENCH);
		System.out.println(df.format(new Date()));
	}
}






