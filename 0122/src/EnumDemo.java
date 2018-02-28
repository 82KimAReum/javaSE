public class EnumDemo {
	private enum Season{
		FALL, WINTER, SPRING, SUMMER;
	}
	public static void main(String[] args) {
		/*for(Season s : Season.values()) {
			System.out.println(s + " , " + s.ordinal() + ", " + s.name());
		}*/
		display(Season.FALL);
	}
	public static void display(Season s) {
		switch(s) {
		case FALL : 
		case SUMMER :
		case WINTER :
		case SPRING : 
		}
	}
}





