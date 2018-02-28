//static method
public class StaticDemo2 {
	private static int num = getNum();
	private static int getNum() {
		System.out.println("나는 스태틱 메소드");  return 100;
	}
	public static void main(String[] args) {
		System.out.println("나는 메인 메소드");
		System.out.println("num = " + num);
	}
}
