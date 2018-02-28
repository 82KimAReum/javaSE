public class ThisDemo1 {
	public static void main(String[] args) {
		Product pencil = new Product();    pencil.name = "연필";
		Product ballpen = pencil.copy();    System.out.println("ballpen's name = " + ballpen.name);
		pencil.name = "컴퓨터";
		System.out.println("ballpen's name = " + ballpen.name);
	}
}
class Product{
	String name;
	Product copy(){   	return this;   }
}




