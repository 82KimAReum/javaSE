import java.util.Calendar;
import java.util.GregorianCalendar;

//java MyCalendar  2018   1
public class MyCalendar {
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		Calendar cal = new GregorianCalendar(year, month - 1, 1);
		int yoil = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(yoil);    //SUN : 1, MON : 2, THU : 3
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		display(year, month, yoil, lastDay);
	}
	static void display(int year, int month, int space, int lastDay) {
		System.out.println("                << " + year + " : " + month + ">>");
		System.out.println("日\t月\t火\t水\t木\t金\t土");
		int count = 0;
		for(int i = 1; i < space ; i++) {
			System.out.print("☆\t");   count++;
		}
		for(int i = 1 ; i <= lastDay ; i++) {
			System.out.print(i + "\t");   count++;
			if(count % 7 == 0) System.out.println();
		}
	}
}













