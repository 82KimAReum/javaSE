
public class MethodDemo5 {
	public static void main(String[] args) {
		String str = "Hello";   System.out.println("Before Change str = " + str);
		change(str);     System.out.println("After Change str = " + str);
	}
	static void change(String msg) {
		msg = "World";   System.out.println("In change msg = " + msg);
	}
}
