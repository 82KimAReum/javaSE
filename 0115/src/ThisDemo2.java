public class ThisDemo2 {
	public static void main(String[] args) {
		Computer com = new Computer();     com.copy();
	}
}
class Computer{
	String name = "컴퓨터";
	int price = 20_000_000;
	public void copy() {   Mouse m = new Mouse();     m.display(this);   }
}
class Mouse{
	public void display(Computer c) {
		System.out.println(c.name + ", " + c.price);
	}
}




