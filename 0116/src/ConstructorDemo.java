
public class ConstructorDemo {
	public static void main(String[] args) {
		Car car = new Car("Carnival", 30_000_000);
		car.print();
		//car.setName("Carnival");
		//car.setPrice(30_000_000);
		car.setName("Matiz");
		car.setPrice(10_000_000);
		car.print();
	}
}
