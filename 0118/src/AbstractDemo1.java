public class AbstractDemo1 {
	public static void main(String[] args) {
		Student  s = new Chulsu();    s.print(); s.display();		                                 
	}
}
abstract class Student{
	public void print() { System.out.println("역시 정상적인 메소드"); }
	public abstract void display();
}
class Chulsu extends Student{
	public void display() {}
}

