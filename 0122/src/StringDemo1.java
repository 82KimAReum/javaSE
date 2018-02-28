//String과 StringBuffer의 차이
public class StringDemo1 {
	public static void main(String[] args) {
		String str = new String("Hello");   
		StringBuffer sb = new StringBuffer("Hello");
		System.out.printf("Before str = %s, sb = %s\n", str, sb.toString());
		change(str, sb);
		System.out.printf("After str = %s, sb = %s\n", str, sb.toString());
	}
	static void change(String str, StringBuffer sb) {
		str = str.concat(", World");         sb.append("World");
		System.out.printf("IN str = %s, sb = %s\n", str, sb.toString());
	}
}




