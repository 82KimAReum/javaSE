//Overshadow variable
public class Derived extends Base{
	String name = "Michael";
	@Override
	void display() {
		super.display();
		System.out.println("나는 자식의 메소드");
	}
}
