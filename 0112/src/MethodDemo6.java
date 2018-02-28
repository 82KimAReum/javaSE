public class MethodDemo6 {
	public static void main(String[] args) {
		MethodDemo6 md = new MethodDemo6();
		Product p =  new Product();
		md.input(p);
		md.print(p);
	}
	void input(Product p) {
		p.name = "Mouse";     	p.price = 30000; 
	}
	void print(Product p) {
		System.out.println(p.name + ", " + p.price);
	}
}
