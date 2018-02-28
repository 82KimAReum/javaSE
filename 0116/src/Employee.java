public class Employee {
	private String empId;
	private String name;
	private int salary;
	public Employee() { //Default Constructor
		System.out.println("방금 객체가 생성됐습니다.");
		this.name = null;   this.salary = 0;
	}
	public Employee(String name) {
		System.out.println("또 다른 생성자");
		this.name = name;
	}
	public void display() {
		System.out.println("name = " + name + ", salary = " + salary);
	}
}
