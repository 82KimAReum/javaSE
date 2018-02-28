public class InterfaceDemo {
	public static void main(String[] args) {
		//4. interface는 instance될 수 없다.
		//Dateable d = new Dateable();
		Dateable d = new Date();
		d.set(Dateable.FRI);  //5. interface의 상수는 interface의 이름으로 접근한다.
		System.out.println("date = " + d.get());
	}
}
