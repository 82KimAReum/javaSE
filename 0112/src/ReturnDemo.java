public class ReturnDemo {
	public static void main(String[] args) {
		mymethod(52);
	}
	static void mymethod(int su) {
		System.out.println("나는 메소드");
		if(su % 2 == 0) return;
		System.out.println("Hello, World");
	}
}
