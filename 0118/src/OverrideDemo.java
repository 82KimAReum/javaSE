public class OverrideDemo {
	public static void main(String[] args) {
		Test t = new Test();       System.out.println(t.toString());
		System.out.println(t);
	}
}
class Test {
	int su = 100;

	@Override
	String toString() {
		return "Test [su=" + su + "]";
	}
	
}

