import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportDemo {
	public static void main(String[] args) {
		out.println("Hello, World");
		int rand = (int)(random() * 6 + 1);
	}
	static double random() {
		return 3.14;
	}
}
