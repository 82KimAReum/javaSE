public class ConstructorDemo {
	public static void main(String[] args) {
		Product pencil = new Product();
		Product ballpen = new Product("볼펜");
		Product computer = new Product(10_000_00);
	}
}
