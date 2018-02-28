public class InterfaceDemo {
	public static void main(String[] args) {
		Product pencil = new Product("연필");
		Product ballpen = (Product)pencil.copy();
		System.out.println(ballpen);
		pencil.setName("컴퓨터");
		System.out.println(ballpen);
	}
}
