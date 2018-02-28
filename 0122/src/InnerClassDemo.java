/*
 * 1. Why?
 * 2. instanciation ==> Outer.Inner in = new Outer.Inner();
 * 3. 제한사항 : static inner class는 outer class의 
 *                     member 요소에 접근할 수 없다. 접근하려면
 *                     outer class의 주소가 필요하다.
 */
public class InnerClassDemo {
	public static void main(String[] args) {
		Outer.Inner in = new Outer.Inner();    in.display();
	}
}
class Outer{
	private int a = 5;    //outer's member variable
	private static int b = 10;    //outer's static variable
	protected static class Inner{
		private int c = 100;      //inner's member variable
		private static int d = 500;     //inner's static variable
		public void display() {
			System.out.println("b = " + b);
		}
	}
}







