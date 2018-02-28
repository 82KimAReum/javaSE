public class Product {
	private String name;
	private int price;
	public Product() {}
	public Product(int price) { this.price = price; }
	public Product(String name) { this.name = name; }
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void display() {
		System.out.println("name = " + name + 
				", price = " + price);
	}
}
