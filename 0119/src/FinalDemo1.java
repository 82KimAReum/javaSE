//final class
public class FinalDemo1 {
	public static void main(String[] args) {
		Child child = new Child();  System.out.println(child.name);
	}
}
final class Parent{
	protected String name = "Sujan";
}
class Child extends Parent{}