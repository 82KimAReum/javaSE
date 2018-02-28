
public class ConstructorDemo {
	public static void main(String[] args) {
		Person p = new Person("Sujan", 168.5);        p.display();
	}
}
class Person{
	private String name;
	private double height;
	public Person(String name, double height) {    
		this.name = name;    this.height = height;
	}
	public void display() { System.out.println("Name : " + name + ", height = " + height);  }
}


