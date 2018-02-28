
public class Sub extends Super {
	private int salary;
	public Sub(int salary) {
		super();
		this.salary = salary;
	}
	public Sub(int salary, String name) {
		super(name);   
		this.salary = salary;
		//this(salary);
	}
}
