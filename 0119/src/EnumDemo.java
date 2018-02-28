
public class EnumDemo {
	public static void main(String[] args) {
		Weekday [] array = Weekday.values();
		for(Weekday w : array) {
			System.out.print(w.name());
			System.out.print(" --> " + w.ordinal());
			System.out.println( " --> " + w.getValue());
		}
	}
}
