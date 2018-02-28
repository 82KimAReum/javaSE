/*
 * Local Inner Class
 * 1. Why? : class의 lifecycle을 짧게 
 * 2. 생성 : 해당 class가 속해있는 method가 호출되어야 한다.
 * 3. 제한사항 : 1)method안에서는 순차적으로 처리돼야 
 *                        하기 때문에 선언하고 생성해야 한다.
 *                     2)JDK 1.6까지는 지역클래스는 지역변수에 
 *                         접근할 수 없다.
 *                     3)Access Modifier 사용 불가
 *                     4)static 사용 불가
 *                     
 */
public class InnerClassDemo2 {
	public static void main(String[] args) {
		new Outer2().print();
	}
}
class Outer2{
	private int a = 5;    //outer's member variable
	private static int b = 10;   //outer's static variable
	public void print() {
		static  int c = 500;    //local variable
		
		//Inner2 in = new Inner2();  
		static class Inner2{
			private int d = 1000;
			public void display() {
				System.out.println("d = " + d);
			}
		};
		Inner2 in = new Inner2(); 
		in.display();
	}
}







