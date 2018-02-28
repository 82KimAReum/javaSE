/*
 * Member Inner Class
 * 1. Why? : 다중 상속도 가능.
 * 2. 생성 : Outer1.Inner1 in = out.new Inner1();
 * 3. 제한사항 : member inner class는 static 요소를 
 *                     가질 수 없다.
 */
public class InnerClassDemo1 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		Outer1.Inner1 in = out.new Inner1();   
		in.display();
	}
}
class Parent {
	double avg = 89.5;
}
class Child{
	boolean flag =true;
}
class Outer1 extends Parent{
	private int a = 5;    //outer's member variable
	private static int b = 10;   //outer's static variable
	public class Inner1 extends Child{
		private int c = 500;
		//private static int d = 1000;
		public void display() {
			System.out.println("avg = " + flag);
		}
	}
}







