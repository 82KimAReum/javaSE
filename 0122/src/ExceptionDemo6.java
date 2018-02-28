public class ExceptionDemo6 {
	public static void main(String[] args) {
		Product pencil = new Product();  
		System.out.println(pencil.price);
		//pencil = null;
		try {
			System.out.println(pencil.price);
		}/*catch(NullPointerException ex) {
			System.out.println("Null");
		}*/finally {
			System.out.println("Always");
		}
	}
}
class Product{
	int price = 30000;
}




