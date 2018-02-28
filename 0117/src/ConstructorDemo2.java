public class ConstructorDemo2 {
	public ConstructorDemo2() {
		System.out.println("나는 생성자 입니다. 방금 객체가 생성됐습니다.");
	}
	protected void finalize() {
		System.out.println("나는 소멸자 입니다. 방금 객체가 소멸됐습니다.");
	}
	public static void main(String[] args) {
		ConstructorDemo2  cd = new ConstructorDemo2(); System.out.println(cd);
		cd = null;       
		System.gc();
		System.out.println(cd);
	}
}
