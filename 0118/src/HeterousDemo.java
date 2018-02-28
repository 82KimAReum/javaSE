public class HeterousDemo {
	public static void main(String[] args) {
		Car [] array = {new Sonata("Black Sonata"),
				new Carnival("Silver Carnival"),
				new Matiz("White Matiz")};
		for(Car car : array) {
			System.out.println(car.getName());
		}
	}
}
