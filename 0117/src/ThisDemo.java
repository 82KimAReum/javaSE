/*
 * this의 용법
 * 1)this. : 나의 
 * 2)this : myself
 * 3)this() : 나의 생성자가 나의 또 다른 생성자를 호출할 때
 */
public class ThisDemo {
	public static void main(String[] args) {
		Employee chulsu = new Employee();
		chulsu.display();
		Employee younghee = new Employee("김영희");
		younghee.display();
		Employee minsu = new Employee(100);
		minsu.display();
		Employee jimin = new Employee("한지민", 150);
		jimin.display();
	}
}






