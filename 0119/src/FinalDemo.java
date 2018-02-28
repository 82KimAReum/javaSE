//final variable --> constant
//final method  --> override 금지 
class Bumo{
	public final void display() { System.out.println("나는 부모의 메소드"); }
}
public class FinalDemo extends Bumo{
	@Override
	public void display() { System.out.println("나는 자식의 메소드"); }
	public static void main(String[] args) {
		Bumo bumo = new FinalDemo();     bumo.display();
		final int su = 5;    //local constant
		System.out.println("su = " + su);
		//su = 100;
	}
}



