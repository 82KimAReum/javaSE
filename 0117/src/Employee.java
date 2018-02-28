public class Employee {
	private String name;
	private int salary;
	public Employee() {
		//System.out.println("나는 기본 생성자");
		this("Unknown", 7530);
	}
	public Employee(String name) {
		this(name, 7530);
	}
	public Employee(int salary) {
		this("Unknown", salary);
	}
	public Employee(String name, int salary) {
		this.name = name;  this.salary = salary;
	}
	public void display() {
		this("Michael", 500);
		System.out.println("name = " + name +
				", salary = " + salary);
	}
}
