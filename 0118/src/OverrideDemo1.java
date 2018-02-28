public class OverrideDemo1 {
	public static void main(String[] args) {
		Point original = new Point(10, 50);
		Point another = new Point(10, 51);
		if(original.equals(another)) System.out.println("같다");
		else System.out.println("다르다.");
	}
}
