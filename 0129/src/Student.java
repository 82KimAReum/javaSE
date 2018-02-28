import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	transient private int age;
	private double weight;
	public Student(String name, int age, double weight) {
		this.name = name;  this.age = age;   this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
}
