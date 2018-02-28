
public class Car {
	/*private String name = "Sonata";
	private int price = 20_000_000;*/
	private String name;
	private int price;
	public Car(String name, int price) {
		System.out.println("방금 객체가 생성됐습니다.");
		this.name = name;   this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void print() {
		System.out.printf("name = %s, price = %d\n", this.name, this.price);
	}
}
