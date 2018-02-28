//Variable Arguments
public class MethodDemo {
	public static void main(String[] args) {
		mymethod(7, 3.14, true);
	}
	static void mymethod(Object ... array) {
		//System.out.println(array.length);
		for(Object su : array) System.out.print(su + "\t");
		System.out.println();
	}
}
