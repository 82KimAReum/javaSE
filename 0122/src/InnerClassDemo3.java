/*
 * Anonumous Inner Class
 */
public class InnerClassDemo3 {
	public static void main(String[] args) {
		double avg = 89.5;   //local variable
		//d.display();
		private Demo d = new Demo() {
			private int su = 5;
			@Override
			public void display() {
				System.out.println("su = " + avg);
			}
		};
		d.display();
	}
}
class Demo{
	public void display() {
		System.out.println("Hello, World");
	}
}





